package p007c.p043b.p044a.p045a.p051b.p054i;

import org.json.JSONException;
import org.json.JSONObject;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.b.a.a.b.i.a, reason: use source file name */
/* JADX INFO: compiled from: IFramePlayerOptions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IFramePlayerOptions {

    /* JADX INFO: renamed from: c */
    public final JSONObject f1934c;

    /* JADX INFO: renamed from: b */
    public static final b f1933b = new b(null);

    /* JADX INFO: renamed from: a */
    public static final IFramePlayerOptions f1932a = new a().m1326b();

    /* JADX INFO: renamed from: c.b.a.a.b.i.a$a */
    /* JADX INFO: compiled from: IFramePlayerOptions.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final JSONObject f1935a;

        /* JADX INFO: renamed from: c.b.a.a.b.i.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IFramePlayerOptions.kt */
        public static final class C8499a {
            public C8499a() {
            }

            public C8499a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            new C8499a(null);
        }

        public a() {
            JSONObject jSONObject = new JSONObject();
            this.f1935a = jSONObject;
            m1325a("autoplay", 0);
            m1325a("controls", 0);
            m1325a("enablejsapi", 1);
            m1325a("fs", 0);
            try {
                jSONObject.put("origin", "https://www.youtube.com");
                m1325a("rel", 0);
                m1325a("showinfo", 0);
                m1325a("iv_load_policy", 3);
                m1325a("modestbranding", 1);
                m1325a("cc_load_policy", 0);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value origin: https://www.youtube.com");
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m1325a(String str, int i) {
            try {
                this.f1935a.put(str, i);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + i);
            }
        }

        /* JADX INFO: renamed from: b */
        public final IFramePlayerOptions m1326b() {
            return new IFramePlayerOptions(this.f1935a, null);
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.b.i.a$b */
    /* JADX INFO: compiled from: IFramePlayerOptions.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public IFramePlayerOptions(JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this.f1934c = jSONObject;
    }

    public String toString() {
        String string = this.f1934c.toString();
        Intrinsics2.m13086b(string, "playerOptions.toString()");
        return string;
    }
}
