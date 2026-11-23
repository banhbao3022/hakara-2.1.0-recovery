package p007c.p114h.p126d.p129c.p133c.p134e;

import java.util.ArrayList;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.h.d.c.c.e.b, reason: use source file name */
/* JADX INFO: compiled from: DynamicColorBaseData.java */
/* JADX INFO: loaded from: classes.dex */
public class DynamicColorBaseData {

    /* JADX INFO: renamed from: a */
    public String f4142a;

    /* JADX INFO: renamed from: b */
    public String f4143b;

    /* JADX INFO: renamed from: c */
    public String f4144c;

    /* JADX INFO: renamed from: f */
    public float f4147f;

    /* JADX INFO: renamed from: h */
    public String f4149h;

    /* JADX INFO: renamed from: i */
    public boolean f4150i;

    /* JADX INFO: renamed from: d */
    public List<String> f4145d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<a> f4146e = new ArrayList();

    /* JADX INFO: renamed from: g */
    public boolean f4148g = false;

    /* JADX INFO: renamed from: c.h.d.c.c.e.b$a */
    /* JADX INFO: compiled from: DynamicColorBaseData.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f4151a;

        /* JADX INFO: renamed from: b */
        public String f4152b;

        public a(String str, String str2) {
            this.f4151a = str;
            this.f4152b = str2;
        }
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("DynamicColorData{name='");
        sbM1556G.append(this.f4142a);
        sbM1556G.append('\'');
        sbM1556G.append(", vertexShader='");
        sbM1556G.append(this.f4143b);
        sbM1556G.append('\'');
        sbM1556G.append(", fragmentShader='");
        sbM1556G.append(this.f4144c);
        sbM1556G.append('\'');
        sbM1556G.append(", uniformList=");
        sbM1556G.append(this.f4145d);
        sbM1556G.append(", uniformDataList=");
        sbM1556G.append(this.f4146e);
        sbM1556G.append(", strength=");
        sbM1556G.append(this.f4147f);
        sbM1556G.append(", texelOffset=");
        sbM1556G.append(this.f4148g);
        sbM1556G.append(", audioPath='");
        sbM1556G.append(this.f4149h);
        sbM1556G.append('\'');
        sbM1556G.append(", audioLooping=");
        sbM1556G.append(this.f4150i);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
