package org.graylog.plugins.httpoutput;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

public class HttpOutputMetaData implements PluginMetaData {
    private static final String PLUGIN_PROPERTIES = "org.graylog.plugins.httpoutput.graylog-plugin-output-http/graylog-plugin.properties";

    @Override
    public String getUniqueId() {
        return "org.graylog.plugins.httpoutput.HttpOutputPlugin";
    }

    @Override
    public String getName() {
        return "HTTP Output";
    }

    @Override
    public String getAuthor() {
        return "Graylog, Inc <hello@graylog.com>";
    }

    @Override
    public URI getURL() {
        return URI.create("https://www.graylog.org/");
    }

    @Override
    public Version getVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "version", Version.from(0, 1, 0));
    }

    @Override
    public String getDescription() {
        return "Forward messages using HTTP";
    }

    @Override
    public Version getRequiredVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "graylog.version", Version.from(2, 4, 0, "unknown"));
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}
