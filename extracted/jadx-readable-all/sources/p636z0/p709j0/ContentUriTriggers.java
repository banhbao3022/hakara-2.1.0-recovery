package p636z0.p709j0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: z0.j0.d, reason: use source file name */
/* JADX INFO: compiled from: ContentUriTriggers.java */
/* JADX INFO: loaded from: classes.dex */
public final class ContentUriTriggers {

    /* JADX INFO: renamed from: a */
    public final Set<a> f37255a = new HashSet();

    /* JADX INFO: renamed from: z0.j0.d$a */
    /* JADX INFO: compiled from: ContentUriTriggers.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Uri f37256a;

        /* JADX INFO: renamed from: b */
        public final boolean f37257b;

        public a(Uri uri, boolean z) {
            this.f37256a = uri;
            this.f37257b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f37257b == aVar.f37257b && this.f37256a.equals(aVar.f37256a);
        }

        public int hashCode() {
            return (this.f37256a.hashCode() * 31) + (this.f37257b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m15877a() {
        return this.f37255a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContentUriTriggers.class != obj.getClass()) {
            return false;
        }
        return this.f37255a.equals(((ContentUriTriggers) obj).f37255a);
    }

    public int hashCode() {
        return this.f37255a.hashCode();
    }
}
