package p007c.p154j.p159k;

import java.util.Objects;
import p007c.p154j.p156h.NoOpsDbHelper;
import p007c.p154j.p158j.DefaultHttpClient;
import p007c.p154j.p158j.HttpClient;

/* JADX INFO: renamed from: c.j.k.a, reason: use source file name */
/* JADX INFO: compiled from: ComponentHolder.java */
/* JADX INFO: loaded from: classes.dex */
public class ComponentHolder {

    /* JADX INFO: renamed from: a */
    public static final ComponentHolder f4430a = new ComponentHolder();

    /* JADX INFO: renamed from: b */
    public int f4431b;

    /* JADX INFO: renamed from: c */
    public int f4432c;

    /* JADX INFO: renamed from: d */
    public String f4433d;

    /* JADX INFO: renamed from: e */
    public HttpClient f4434e;

    /* JADX INFO: renamed from: f */
    public NoOpsDbHelper f4435f;

    /* JADX INFO: renamed from: a */
    public NoOpsDbHelper m2228a() {
        if (this.f4435f == null) {
            synchronized (ComponentHolder.class) {
                if (this.f4435f == null) {
                    this.f4435f = new NoOpsDbHelper();
                }
            }
        }
        return this.f4435f;
    }

    /* JADX INFO: renamed from: b */
    public HttpClient m2229b() {
        if (this.f4434e == null) {
            synchronized (ComponentHolder.class) {
                if (this.f4434e == null) {
                    this.f4434e = new DefaultHttpClient();
                }
            }
        }
        Objects.requireNonNull((DefaultHttpClient) this.f4434e);
        return new DefaultHttpClient();
    }
}
