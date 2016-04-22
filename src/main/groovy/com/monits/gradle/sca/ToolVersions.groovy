/*
 * Copyright 2010-2016 Monits S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
 * ANY KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.monits.gradle.sca

import org.gradle.util.GradleVersion

final class ToolVersions {
    private final static String LATEST_PMD_TOOL_VERSION = '5.4.1'
    private final static String BACKWARDS_PMD_TOOL_VERSION = '5.1.3'
    private final static GradleVersion GRADLE_VERSION_PMD = GradleVersion.version('2.4');

    private ToolVersions() {
        // utility class
    }

    static String getPmdVersion() {
        if (GradleVersion.current() < GRADLE_VERSION_PMD) {
            return BACKWARDS_PMD_TOOL_VERSION
        }

        return LATEST_PMD_TOOL_VERSION
    }

    static boolean isLatestPmdVersion() {
        return pmdVersion == LATEST_PMD_TOOL_VERSION
    }
}
