package p007c.p080e.p081a;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.e.a.g, reason: use source file name */
/* JADX INFO: compiled from: Statistics.java */
/* JADX INFO: loaded from: classes.dex */
public class Statistics {

    /* JADX INFO: renamed from: a */
    public long f2808a;

    /* JADX INFO: renamed from: b */
    public int f2809b;

    /* JADX INFO: renamed from: c */
    public float f2810c;

    /* JADX INFO: renamed from: d */
    public float f2811d;

    /* JADX INFO: renamed from: e */
    public long f2812e;

    /* JADX INFO: renamed from: f */
    public int f2813f;

    /* JADX INFO: renamed from: g */
    public double f2814g;

    /* JADX INFO: renamed from: h */
    public double f2815h;

    public Statistics() {
        this.f2808a = 0L;
        this.f2809b = 0;
        this.f2810c = 0.0f;
        this.f2811d = 0.0f;
        this.f2812e = 0L;
        this.f2813f = 0;
        this.f2814g = 0.0d;
        this.f2815h = 0.0d;
    }

    public String toString() {
        StringBuilder sbM1561L = outline.m1561L("Statistics{", "executionId=");
        sbM1561L.append(this.f2808a);
        sbM1561L.append(", videoFrameNumber=");
        sbM1561L.append(this.f2809b);
        sbM1561L.append(", videoFps=");
        sbM1561L.append(this.f2810c);
        sbM1561L.append(", videoQuality=");
        sbM1561L.append(this.f2811d);
        sbM1561L.append(", size=");
        sbM1561L.append(this.f2812e);
        sbM1561L.append(", time=");
        sbM1561L.append(this.f2813f);
        sbM1561L.append(", bitrate=");
        sbM1561L.append(this.f2814g);
        sbM1561L.append(", speed=");
        sbM1561L.append(this.f2815h);
        sbM1561L.append('}');
        return sbM1561L.toString();
    }

    public Statistics(long j2, int i, float f, float f2, long j3, int i2, double d, double d2) {
        this.f2808a = j2;
        this.f2809b = i;
        this.f2810c = f;
        this.f2811d = f2;
        this.f2812e = j3;
        this.f2813f = i2;
        this.f2814g = d;
        this.f2815h = d2;
    }
}
