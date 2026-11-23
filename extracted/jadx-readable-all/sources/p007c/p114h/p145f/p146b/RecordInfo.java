package p007c.p114h.p145f.p146b;

/* JADX INFO: renamed from: c.h.f.b.i, reason: use source file name */
/* JADX INFO: compiled from: RecordInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class RecordInfo {

    /* JADX INFO: renamed from: a */
    public String f4326a;

    /* JADX INFO: renamed from: b */
    public long f4327b;

    /* JADX INFO: renamed from: c */
    public MediaType f4328c;

    public RecordInfo(String str, long j2, MediaType mediaType) {
        this.f4326a = str;
        this.f4327b = j2;
        this.f4328c = mediaType;
    }

    public RecordInfo(String str, MediaType mediaType) {
        this.f4326a = str;
        this.f4327b = -1L;
        this.f4328c = mediaType;
    }
}
