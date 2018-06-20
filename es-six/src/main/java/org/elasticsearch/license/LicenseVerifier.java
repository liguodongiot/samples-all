package org.elasticsearch.license;

/**
 * 编译该类还需要导入x-pack-core
 * https://artifacts.elastic.co/maven
 *
 *         <dependency>
 *             <groupId>org.elasticsearch.plugin</groupId>
 *             <artifactId>x-pack-core</artifactId>
 *             <version>6.3.0</version>
 *         </dependency>
 */

public class LicenseVerifier {
    public LicenseVerifier() {
    }

    public static boolean verifyLicense(License license, byte[] encryptedPublicKeyData) {
        return true;
    }

    public static boolean verifyLicense(License license) {
        return true;
    }
}

