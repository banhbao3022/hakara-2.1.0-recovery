package p636z0.p767w.p768a;

import p636z0.p765v.VolumeProviderCompat;

/* JADX INFO: renamed from: z0.w.a.g, reason: use source file name */
/* JADX INFO: compiled from: MediaRouter.java */
/* JADX INFO: loaded from: classes.dex */
public class MediaRouter2 extends VolumeProviderCompat {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ MediaRouter.d.c f38894g;

    /* JADX INFO: renamed from: z0.w.a.g$a */
    /* JADX INFO: compiled from: MediaRouter.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f38895f;

        public a(int i) {
            this.f38895f = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaRouter.g gVar = MediaRouter.d.this.f38852o;
            if (gVar != null) {
                gVar.m16838e(this.f38895f);
            }
        }
    }

    /* JADX INFO: renamed from: z0.w.a.g$b */
    /* JADX INFO: compiled from: MediaRouter.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f38897f;

        public b(int i) {
            this.f38897f = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaRouter.g gVar = MediaRouter.d.this.f38852o;
            if (gVar != null) {
                gVar.m16839f(this.f38897f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaRouter2(MediaRouter.d.c cVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.f38894g = cVar;
    }

    @Override // p636z0.p765v.VolumeProviderCompat
    /* JADX INFO: renamed from: b */
    public void mo16767b(int i) {
        MediaRouter.d.this.f38846i.post(new b(i));
    }

    @Override // p636z0.p765v.VolumeProviderCompat
    /* JADX INFO: renamed from: c */
    public void mo16768c(int i) {
        MediaRouter.d.this.f38846i.post(new a(i));
    }
}
