package com.jetbrains.refactoring;

import java.security.AuthProvider;

public class Rename {
    enum Provider {
        EC2, GCE, AZURE
    }

    static class CloudProvider {
        private Provider provider;
        private AuthProvider authProvider;

        public CloudProvider(Provider provider) {
            this.provider = provider;
        }

        public Provider getProvider() {
            return this.provider;
        }

        public void setAuthProvider(AuthProvider authProvider) {
            this.authProvider = authProvider;
        }
    }

    public static void main(String[] args) {
        CloudProvider primary = new CloudProvider(Provider.EC2);
        CloudProvider secondary = new CloudProvider(Provider.GCE);

        primary.setAuthProvider(null);
        secondary.setAuthProvider(primary.authProvider);
    }
}
