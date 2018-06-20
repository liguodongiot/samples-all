package org.elasticsearch.xpack.core;

import org.elasticsearch.common.SuppressForbidden;
import org.elasticsearch.common.io.PathUtils;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;

public class XPackBuild {
    public static final XPackBuild CURRENT;
    private String shortHash;
    private String date;

    @SuppressForbidden(
            reason = "looks up path of xpack.jar directly"
    )
    static Path getElasticsearchCodebase() {
        URL url = XPackBuild.class.getProtectionDomain().getCodeSource().getLocation();

        try {
            return PathUtils.get(url.toURI());
        } catch (URISyntaxException var2) {
            throw new RuntimeException(var2);
        }
    }

    XPackBuild(String shortHash, String date) {
        this.shortHash = shortHash;
        this.date = date;
    }

    public String shortHash() {
        return this.shortHash;
    }

    public String date() {
        return this.date;
    }

    static {
        String shortHash = "Unknown";
        String date = "Unknown";

        CURRENT = new XPackBuild(shortHash, date);
    }
}

