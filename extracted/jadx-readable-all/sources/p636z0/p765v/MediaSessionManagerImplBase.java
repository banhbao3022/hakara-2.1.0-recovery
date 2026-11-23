package p636z0.p765v;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: z0.v.c, reason: use source file name */
/* JADX INFO: compiled from: MediaSessionManagerImplBase.java */
/* JADX INFO: loaded from: classes.dex */
public class MediaSessionManagerImplBase {

    /* JADX INFO: renamed from: a */
    public String f38792a;

    /* JADX INFO: renamed from: b */
    public int f38793b;

    /* JADX INFO: renamed from: c */
    public int f38794c;

    public MediaSessionManagerImplBase(String str, int i, int i2) {
        this.f38792a = str;
        this.f38793b = i;
        this.f38794c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionManagerImplBase)) {
            return false;
        }
        MediaSessionManagerImplBase mediaSessionManagerImplBase = (MediaSessionManagerImplBase) obj;
        if (this.f38793b < 0 || mediaSessionManagerImplBase.f38793b < 0) {
            return TextUtils.equals(this.f38792a, mediaSessionManagerImplBase.f38792a) && this.f38794c == mediaSessionManagerImplBase.f38794c;
        }
        return TextUtils.equals(this.f38792a, mediaSessionManagerImplBase.f38792a) && this.f38793b == mediaSessionManagerImplBase.f38793b && this.f38794c == mediaSessionManagerImplBase.f38794c;
    }

    public int hashCode() {
        return Objects.hash(this.f38792a, Integer.valueOf(this.f38794c));
    }
}
