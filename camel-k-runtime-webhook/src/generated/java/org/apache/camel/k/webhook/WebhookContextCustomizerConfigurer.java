/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.k.webhook;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.k.webhook.WebhookContextCustomizer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WebhookContextCustomizerConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("Action", org.apache.camel.k.webhook.WebhookAction.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.k.webhook.WebhookContextCustomizer target = (org.apache.camel.k.webhook.WebhookContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action":
        case "Action": target.setAction(property(camelContext, org.apache.camel.k.webhook.WebhookAction.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.k.webhook.WebhookContextCustomizer target = (org.apache.camel.k.webhook.WebhookContextCustomizer) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action":
        case "Action": return target.getAction();
        default: return null;
        }
    }
}

