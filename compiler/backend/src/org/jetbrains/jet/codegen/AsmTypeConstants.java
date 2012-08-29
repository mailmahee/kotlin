/*
 * Copyright 2010-2012 JetBrains s.r.o.
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

package org.jetbrains.jet.codegen;

import org.jetbrains.asm4.Type;

import java.lang.annotation.Annotation;
import java.util.Iterator;

/**
 * @author alex.tkachman
 */
public class AsmTypeConstants {
    public static final Type OBJECT_TYPE = Type.getType(Object.class);
    public static final Type JAVA_NUMBER_TYPE = Type.getType(Number.class);
    public static final Type JAVA_STRING_BUILDER_TYPE = Type.getType(StringBuilder.class);
    public static final Type JAVA_STRING_TYPE = Type.getType(String.class);
    public static final Type JAVA_THROWABLE_TYPE = Type.getType(Throwable.class);
    public static final Type JAVA_CLASS_TYPE = Type.getType(Class.class);
    public static final Type JAVA_BOOLEAN_TYPE = Type.getType(Boolean.class);
    public static final Type JAVA_ARRAY_GENERIC_TYPE = Type.getType(Object[].class);
    public static final Type JAVA_CHAR_SEQUENCE_TYPE = Type.getType(CharSequence.class);
    public static final Type JAVA_COMPARABLE_TYPE = Type.getType(Comparable.class);
    public static final Type JAVA_ENUM_TYPE = Type.getType(Enum.class);
    public static final Type JAVA_ANNOTATION_TYPE = Type.getType(Annotation.class);
    public static final Type JAVA_ITERATOR_TYPE = Type.getType(Iterator.class);
    public static final Type JAVA_ITERABLE_TYPE = Type.getType(Iterable.class);

    public static final Type JET_NOTHING_TYPE = Type.getObjectType("jet/Nothing");
    public static final Type JET_TUPLE0_TYPE = Type.getObjectType("jet/Tuple0");
    public static final Type JET_FUNCTION0_TYPE = Type.getObjectType("jet/Function0");
    public static final Type JET_FUNCTION1_TYPE = Type.getObjectType("jet/Function1");
    public static final Type JET_ITERATOR_TYPE = Type.getObjectType("jet/Iterator");
    public static final Type JET_INT_RANGE_TYPE = Type.getObjectType("jet/IntRange");
    public static final Type JET_SHARED_VAR_TYPE = Type.getObjectType("jet/runtime/SharedVar$Object");
    public static final Type JET_SHARED_INT_TYPE = Type.getObjectType("jet/runtime/SharedVar$Int");
    public static final Type JET_SHARED_DOUBLE_TYPE = Type.getObjectType("jet/runtime/SharedVar$Double");
    public static final Type JET_SHARED_FLOAT_TYPE = Type.getObjectType("jet/runtime/SharedVar$Float");
    public static final Type JET_SHARED_BYTE_TYPE = Type.getObjectType("jet/runtime/SharedVar$Byte");
    public static final Type JET_SHARED_SHORT_TYPE = Type.getObjectType("jet/runtime/SharedVar$Short");
    public static final Type JET_SHARED_CHAR_TYPE = Type.getObjectType("jet/runtime/SharedVar$Char");
    public static final Type JET_SHARED_LONG_TYPE = Type.getObjectType("jet/runtime/SharedVar$Long");
    public static final Type JET_SHARED_BOOLEAN_TYPE = Type.getObjectType("jet/runtime/SharedVar$Boolean");

    private AsmTypeConstants() {
    }
}