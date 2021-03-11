package com.jetbrains.code.jdk16;

/**
 * <p>Simple example of a record.</p>
 * <ul>
 *     <li>#PreviewFeature First Preview #JDK14</li>
 *     <li>#PreviewFeature Second Preview #JDK15</li>
 *     <li>#StandardFeature #JDK16</li>
 * </ul>
 * <p>If you want to change a property name you should use refactoring</p>
 *
 * @param id   unique identifier
 * @param name the descriptive name
 */
record Record(int id, String name) {
    // - Generate a constructor. Note: non-public constructors supported (#JDK15)
    // - Generate an accessor. Note: annotations supported (#JDK15)
    // - Generate getter does the right thing with the name
    // - There is no generate setter

    //<editor-fold desc="Helper methods">
    @SuppressWarnings("unused")
    private void validateMyFields(int id, String name) {
        // do validate fields
    }
    //</editor-fold>

}

