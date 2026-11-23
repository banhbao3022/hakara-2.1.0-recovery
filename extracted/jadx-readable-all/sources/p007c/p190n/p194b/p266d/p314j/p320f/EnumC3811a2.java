package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.a2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3811a2 implements InterfaceC3834c5 {
    DEVELOPER_FEATURE_FLAG_UNKNOWN(0),
    CAF_CAST_BUTTON(1),
    CAF_EXPANDED_CONTROLLER(2),
    CAF_MINI_CONTROLLER(3),
    CAF_CONTAINER_CONTROLLER(4),
    CAST_CONTEXT(5),
    IMAGE_CACHE(6),
    IMAGE_PICKER(7),
    AD_BREAK_PARSER(8),
    UI_STYLE(9),
    HARDWARE_VOLUME_BUTTON(10),
    NON_CAST_DEVICE_PROVIDER(11),
    PAUSE_CONTROLLER(12),
    SEEK_CONTROLLER(13),
    STREAM_VOLUME(14),
    UI_MEDIA_CONTROLLER(15),
    PLAYBACK_RATE_CONTROLLER(16),
    PRECACHE(17),
    INSTRUCTIONS_VIEW(18),
    OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED(19),
    OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION(20),
    OPTION_DISABLE_DISCOVERY_AUTOSTART(21),
    OPTION_DISABLE_ANALYTICS_LOGGING(22),
    OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME(23),
    CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT(24),
    CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT(25),
    REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS(26),
    REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS(27),
    REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA(28),
    LAUNCH_OPTION_ANDROID_RECEIVER_ENABLED(29);


    /* JADX INFO: renamed from: K */
    public final int f22504K;

    EnumC3811a2(int i) {
        this.f22504K = i;
    }

    /* JADX INFO: renamed from: f */
    public static EnumC3811a2 m8923f(int i) {
        switch (i) {
            case 0:
                return DEVELOPER_FEATURE_FLAG_UNKNOWN;
            case 1:
                return CAF_CAST_BUTTON;
            case 2:
                return CAF_EXPANDED_CONTROLLER;
            case 3:
                return CAF_MINI_CONTROLLER;
            case 4:
                return CAF_CONTAINER_CONTROLLER;
            case 5:
                return CAST_CONTEXT;
            case 6:
                return IMAGE_CACHE;
            case 7:
                return IMAGE_PICKER;
            case 8:
                return AD_BREAK_PARSER;
            case 9:
                return UI_STYLE;
            case 10:
                return HARDWARE_VOLUME_BUTTON;
            case 11:
                return NON_CAST_DEVICE_PROVIDER;
            case 12:
                return PAUSE_CONTROLLER;
            case 13:
                return SEEK_CONTROLLER;
            case 14:
                return STREAM_VOLUME;
            case 15:
                return UI_MEDIA_CONTROLLER;
            case 16:
                return PLAYBACK_RATE_CONTROLLER;
            case 17:
                return PRECACHE;
            case 18:
                return INSTRUCTIONS_VIEW;
            case 19:
                return OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
            case 20:
                return OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
            case 21:
                return OPTION_DISABLE_DISCOVERY_AUTOSTART;
            case 22:
                return OPTION_DISABLE_ANALYTICS_LOGGING;
            case 23:
                return OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
            case 24:
                return CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
            case 25:
                return CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
            case 26:
                return REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
            case 27:
                return REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
            case 28:
                return REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
            case 29:
                return LAUNCH_OPTION_ANDROID_RECEIVER_ENABLED;
            default:
                return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3834c5
    /* JADX INFO: renamed from: d */
    public final int mo8924d() {
        return this.f22504K;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC3811a2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f22504K + " name=" + name() + '>';
    }
}
