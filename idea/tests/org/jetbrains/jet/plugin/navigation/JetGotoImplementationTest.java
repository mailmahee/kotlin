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

package org.jetbrains.jet.plugin.navigation;

import com.intellij.codeInsight.navigation.GotoTargetHandler;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.testFramework.LightCodeInsightTestCase;
import org.jetbrains.jet.plugin.PluginTestCaseBase;

import java.io.File;

public class JetGotoImplementationTest extends LightCodeInsightTestCase {
    public void testClassNavigation() {
        doTest();
    }

    public void testClassImplementatorsWithDeclaration() {
        doTest();
    }

    @Override
    protected String getTestDataPath() {
        return new File(PluginTestCaseBase.getTestDataPathBase(), "/navigation/implementations").getPath() +
               File.separator;
    }

    @Override
    protected Sdk getProjectJDK() {
        return PluginTestCaseBase.jdkFromIdeaHome();
    }

    protected void doTest() {
        configureByFile(getTestName(false) + ".kt");
        GotoTargetHandler.GotoData gotoData = NavigationTestUtils.invokeGotoImplementations(getEditor(), getFile());
        NavigationTestUtils.assertGotoImplementations(getEditor(), gotoData);
    }
}
