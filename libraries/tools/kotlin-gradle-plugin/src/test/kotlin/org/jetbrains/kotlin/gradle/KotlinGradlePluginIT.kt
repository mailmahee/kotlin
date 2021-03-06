package org.jetbrains.kotlin.gradle

import com.google.common.io.Files
import com.intellij.openapi.util.SystemInfo
import java.io.File
import java.util.Arrays
import java.util.Scanner
import org.junit.Before
import org.junit.After
import org.junit.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals
import kotlin.test.fail

class BasicKotlinGradleIT {

    var workingDir: File = File(".")

    Before fun setUp() {
        workingDir = Files.createTempDir()
        workingDir.mkdirs()
        copyRecursively(File("src/test/resources/testProject/alfa"), workingDir)
    }


    After fun tearDown() {
        deleteRecursively(workingDir)
    }

    Test fun testSimpleCompile() {
        val projectDir = File(workingDir, "alfa")

        val pathToKotlinPlugin = "-PpathToKotlinPlugin=" + File("local-repo").getAbsolutePath()
        val cmd = if (SystemInfo.isWindows)
            listOf("cmd", "/C", "gradlew.bat", "clean", "compileDeployKotlin", "build", pathToKotlinPlugin, "--no-daemon", "--debug")
        else
            listOf("/bin/bash", "./gradlew", "clean", "compileDeployKotlin", "build", pathToKotlinPlugin, "--no-daemon", "--debug")

        val builder = ProcessBuilder(cmd)
        builder.directory(projectDir)

        builder.redirectErrorStream(true)
        val process = builder.start()

        val s = Scanner(process.getInputStream()!!)
        val text = StringBuilder()
        while (s.hasNextLine()) {
            text append s.nextLine()
            text append "\n"
        }
        s.close()

        val result = process.waitFor()
        val buildOutput = text.toString()

        println(buildOutput)

        assertEquals(result, 0)
        assertTrue(buildOutput.contains(":compileKotlin"), "Should contain ':compileKotlin'")
        assertTrue(buildOutput.contains(":compileTestKotlin"), "Should contain ':compileTestKotlin'")
        assertTrue(buildOutput.contains(":compileDeployKotlin"), "Should contain ':compileDeployKotlin'")
    }


    fun copyRecursively(source: File, target: File) {
        assertTrue(target.isDirectory())
        val targetFile = File(target, source.getName())
        if (source.isDirectory()) {
            targetFile.mkdir()
            val array = source.listFiles()
            if (array != null) {
                for (child in array) {
                    copyRecursively(child, targetFile)
                }
            }
        } else {
            Files.copy(source, targetFile)
        }
    }


    fun deleteRecursively(f: File): Unit {
        if (f.isDirectory()) {
            val children = f.listFiles()
            if (children != null) {
                for (child in children) {
                    deleteRecursively(child)
                }
            }
            val shouldBeEmpty = f.listFiles()
            if (shouldBeEmpty != null) {
                assertTrue(shouldBeEmpty.isEmpty())
            } else {
                fail("Error listing directory content")
            }
        }
        f.delete()
    }
}