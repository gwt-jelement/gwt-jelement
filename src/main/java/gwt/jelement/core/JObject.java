package gwt.jelement.core;

import elemental2.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JObject extends JsObject {

    @JsOverlay
    public final <T> T get(String key) {
        return Utils.get(this, key);
    }

    @JsOverlay
    public final <T> void set(String key, T value) {
        Utils.set(this, key, value);
    }

    @JsOverlay
    public final boolean has(String key) {
        return Utils.has(this, key);
    }

    private static final class Utils {
        private Utils() {
        }

        public static native <T> void set(JObject object, String key, T value)/*-{
            object[key] = value;
        }-*/;

        public static native <T> T get(JObject object, String key)/*-{
            return object[key];
        }-*/;

        public static native boolean has(JObject jObject, String key) /*-{
            return key in object;
        }-*/;
    }

}
