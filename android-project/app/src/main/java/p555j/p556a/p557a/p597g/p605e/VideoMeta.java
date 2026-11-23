package p555j.p556a.p557a.p597g.p605e;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: j.a.a.g.e.b, reason: use source file name */
/* JADX INFO: compiled from: VideoMeta.java */
/* JADX INFO: loaded from: classes.dex */
public class VideoMeta {

    /* JADX INFO: renamed from: a */
    public String f32206a;

    /* JADX INFO: renamed from: b */
    public String f32207b;

    /* JADX INFO: renamed from: c */
    public String f32208c;

    /* JADX INFO: renamed from: d */
    public String f32209d;

    /* JADX INFO: renamed from: e */
    public long f32210e;

    /* JADX INFO: renamed from: f */
    public long f32211f;

    /* JADX INFO: renamed from: g */
    public boolean f32212g;

    public VideoMeta(String str, String str2, String str3, String str4, long j2, long j3, boolean z, String str5) {
        this.f32206a = str;
        this.f32207b = str2;
        this.f32208c = str3;
        this.f32209d = str4;
        this.f32210e = j2;
        this.f32211f = j3;
        this.f32212g = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VideoMeta.class != obj.getClass()) {
            return false;
        }
        VideoMeta videoMeta = (VideoMeta) obj;
        if (this.f32210e != videoMeta.f32210e || this.f32211f != videoMeta.f32211f || this.f32212g != videoMeta.f32212g) {
            return false;
        }
        String str = this.f32206a;
        if (str == null ? videoMeta.f32206a != null : !str.equals(videoMeta.f32206a)) {
            return false;
        }
        String str2 = this.f32207b;
        if (str2 == null ? videoMeta.f32207b != null : !str2.equals(videoMeta.f32207b)) {
            return false;
        }
        String str3 = this.f32208c;
        if (str3 == null ? videoMeta.f32208c != null : !str3.equals(videoMeta.f32208c)) {
            return false;
        }
        String str4 = this.f32209d;
        String str5 = videoMeta.f32209d;
        if (str4 != null) {
            return str4.equals(str5);
        }
        return str5 == null;
    }

    public int hashCode() {
        String str = this.f32206a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32207b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32208c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f32209d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        long j2 = this.f32210e;
        int i = (iHashCode4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f32211f;
        return ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f32212g ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("VideoMeta{videoId='");
        sbM1556G.append(this.f32206a);
        sbM1556G.append('\'');
        sbM1556G.append(", title='");
        sbM1556G.append(this.f32207b);
        sbM1556G.append('\'');
        sbM1556G.append(", author='");
        sbM1556G.append(this.f32208c);
        sbM1556G.append('\'');
        sbM1556G.append(", channelId='");
        sbM1556G.append(this.f32209d);
        sbM1556G.append('\'');
        sbM1556G.append(", videoLength=");
        sbM1556G.append(this.f32210e);
        sbM1556G.append(", viewCount=");
        sbM1556G.append(this.f32211f);
        sbM1556G.append(", isLiveStream=");
        sbM1556G.append(this.f32212g);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
