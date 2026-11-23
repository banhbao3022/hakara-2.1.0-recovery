package p555j.p556a.p557a.p606h.p607a;

import com.cgfay.media.CainMediaMetadataRetriever;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.h.a.d, reason: use source file name */
/* JADX INFO: compiled from: MediaItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MediaItem3 {

    /* JADX INFO: renamed from: a */
    public final long f32256a;

    /* JADX INFO: renamed from: b */
    public final String f32257b;

    /* JADX INFO: renamed from: c */
    public final String f32258c;

    /* JADX INFO: renamed from: d */
    public final String f32259d;

    /* JADX INFO: renamed from: e */
    public final String f32260e;

    /* JADX INFO: renamed from: f */
    public final boolean f32261f;

    public MediaItem3(long j2, String str, String str2, String str3, String str4, boolean z) {
        Intrinsics2.m13089e(str, CainMediaMetadataRetriever.METADATA_KEY_TITLE);
        Intrinsics2.m13089e(str2, "mediaUrl");
        this.f32256a = j2;
        this.f32257b = str;
        this.f32258c = str2;
        this.f32259d = str3;
        this.f32260e = str4;
        this.f32261f = z;
    }

    public /* synthetic */ MediaItem3(long j2, String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? true : z);
    }
}
