/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.lang.resolve.lazy;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;

import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.lang.resolve.lazy.AbstractLazyResolveTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/resolve/imports")
public class LazyResolveFullTestGenerated extends AbstractLazyResolveTest {
    public void testAllFilesPresentInImports() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/resolve/imports"), Pattern.compile("^(\\w+)\\.java$"), false);
    }
    
    @TestMetadata("ImportConflictAllPackage.resolve")
    public void testImportConflictAllPackage() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportConflictAllPackage.resolve");
    }
    
    @TestMetadata("ImportConflictBetweenImportedAndRootPackage.resolve")
    public void testImportConflictBetweenImportedAndRootPackage() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportConflictBetweenImportedAndRootPackage.resolve");
    }
    
    @TestMetadata("ImportConflictBetweenImportedAndSamePackage.resolve")
    public void testImportConflictBetweenImportedAndSamePackage() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportConflictBetweenImportedAndSamePackage.resolve");
    }
    
    @TestMetadata("ImportConflictForFunctions.resolve")
    public void testImportConflictForFunctions() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportConflictForFunctions.resolve");
    }
    
    @TestMetadata("ImportConflictPackageAndClass.resolve")
    public void testImportConflictPackageAndClass() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportConflictPackageAndClass.resolve");
    }
    
    @TestMetadata("ImportConflictSameNameClass.resolve")
    public void testImportConflictSameNameClass() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportConflictSameNameClass.resolve");
    }
    
    @TestMetadata("ImportConflictWithClassObject.resolve")
    public void testImportConflictWithClassObject() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportConflictWithClassObject.resolve");
    }
    
    @TestMetadata("ImportConflictWithInFileClass.resolve")
    public void testImportConflictWithInFileClass() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportConflictWithInFileClass.resolve");
    }
    
    @TestMetadata("ImportConflictWithInnerClass.resolve")
    public void testImportConflictWithInnerClass() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportConflictWithInnerClass.resolve");
    }
    
    @TestMetadata("ImportConflictsWithMappedToJava.resolve")
    public void testImportConflictsWithMappedToJava() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportConflictsWithMappedToJava.resolve");
    }
    
    @TestMetadata("ImportNonBlockingAnalysis.resolve")
    public void testImportNonBlockingAnalysis() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportNonBlockingAnalysis.resolve");
    }
    
    @TestMetadata("ImportResolveOrderStable.resolve")
    public void testImportResolveOrderStable() throws Exception {
        doTest("compiler/testData/resolve/imports/ImportResolveOrderStable.resolve");
    }
    
}
