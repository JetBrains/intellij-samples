package com.jetbrains.code.jdk17;

/**
 * <p>Sealed classes.</p>
 * <ul>
 *     <li>#PreviewFeature First Preview #JDK15
 *     <li>#PreviewFeature Second Preview #JDK16
 *     <li>#StandardFeature #JDK17
 * </ul>
 */
public sealed class SealedClass
        permits ChildClass {
}


