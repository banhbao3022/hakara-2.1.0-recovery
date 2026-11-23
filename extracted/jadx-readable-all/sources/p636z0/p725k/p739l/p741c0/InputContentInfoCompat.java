package p636z0.p725k.p739l.p741c0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: z0.k.l.c0.e, reason: use source file name */
/* JADX INFO: compiled from: InputContentInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class InputContentInfoCompat {

    /* JADX INFO: renamed from: a */
    public final c f38050a;

    /* JADX INFO: renamed from: z0.k.l.c0.e$b */
    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public final Uri f38052a;

        /* JADX INFO: renamed from: b */
        public final ClipDescription f38053b;

        /* JADX INFO: renamed from: c */
        public final Uri f38054c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f38052a = uri;
            this.f38053b = clipDescription;
            this.f38054c = uri2;
        }

        @Override // p636z0.p725k.p739l.p741c0.InputContentInfoCompat.c
        /* JADX INFO: renamed from: a */
        public Uri mo16284a() {
            return this.f38052a;
        }

        @Override // p636z0.p725k.p739l.p741c0.InputContentInfoCompat.c
        /* JADX INFO: renamed from: b */
        public void mo16285b() {
        }

        @Override // p636z0.p725k.p739l.p741c0.InputContentInfoCompat.c
        /* JADX INFO: renamed from: c */
        public Uri mo16286c() {
            return this.f38054c;
        }

        @Override // p636z0.p725k.p739l.p741c0.InputContentInfoCompat.c
        /* JADX INFO: renamed from: d */
        public ClipDescription mo16287d() {
            return this.f38053b;
        }

        @Override // p636z0.p725k.p739l.p741c0.InputContentInfoCompat.c
        /* JADX INFO: renamed from: e */
        public Object mo16288e() {
            return null;
        }
    }

    /* JADX INFO: renamed from: z0.k.l.c0.e$c */
    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        Uri mo16284a();

        /* JADX INFO: renamed from: b */
        void mo16285b();

        /* JADX INFO: renamed from: c */
        Uri mo16286c();

        /* JADX INFO: renamed from: d */
        ClipDescription mo16287d();

        /* JADX INFO: renamed from: e */
        Object mo16288e();
    }

    public InputContentInfoCompat(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f38050a = new a(uri, clipDescription, uri2);
        } else {
            this.f38050a = new b(uri, clipDescription, uri2);
        }
    }

    /* JADX INFO: renamed from: z0.k.l.c0.e$a */
    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    public static final class a implements c {

        /* JADX INFO: renamed from: a */
        public final InputContentInfo f38051a;

        public a(Object obj) {
            this.f38051a = (InputContentInfo) obj;
        }

        @Override // p636z0.p725k.p739l.p741c0.InputContentInfoCompat.c
        /* JADX INFO: renamed from: a */
        public Uri mo16284a() {
            return this.f38051a.getContentUri();
        }

        @Override // p636z0.p725k.p739l.p741c0.InputContentInfoCompat.c
        /* JADX INFO: renamed from: b */
        public void mo16285b() {
            this.f38051a.requestPermission();
        }

        @Override // p636z0.p725k.p739l.p741c0.InputContentInfoCompat.c
        /* JADX INFO: renamed from: c */
        public Uri mo16286c() {
            return this.f38051a.getLinkUri();
        }

        @Override // p636z0.p725k.p739l.p741c0.InputContentInfoCompat.c
        /* JADX INFO: renamed from: d */
        public ClipDescription mo16287d() {
            return this.f38051a.getDescription();
        }

        @Override // p636z0.p725k.p739l.p741c0.InputContentInfoCompat.c
        /* JADX INFO: renamed from: e */
        public Object mo16288e() {
            return this.f38051a;
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f38051a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public InputContentInfoCompat(c cVar) {
        this.f38050a = cVar;
    }
}
