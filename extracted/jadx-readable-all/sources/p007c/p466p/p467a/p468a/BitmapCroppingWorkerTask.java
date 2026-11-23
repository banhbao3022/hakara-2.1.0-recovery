package p007c.p466p.p467a.p468a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.CropImageActivity;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: c.p.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: BitmapCroppingWorkerTask.java */
/* JADX INFO: loaded from: classes.dex */
public final class BitmapCroppingWorkerTask extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a */
    public final WeakReference<CropImageView> f27937a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f27938b;

    /* JADX INFO: renamed from: c */
    public final Uri f27939c;

    /* JADX INFO: renamed from: d */
    public final Context f27940d;

    /* JADX INFO: renamed from: e */
    public final float[] f27941e;

    /* JADX INFO: renamed from: f */
    public final int f27942f;

    /* JADX INFO: renamed from: g */
    public final int f27943g;

    /* JADX INFO: renamed from: h */
    public final int f27944h;

    /* JADX INFO: renamed from: i */
    public final boolean f27945i;

    /* JADX INFO: renamed from: j */
    public final int f27946j;

    /* JADX INFO: renamed from: k */
    public final int f27947k;

    /* JADX INFO: renamed from: l */
    public final int f27948l;

    /* JADX INFO: renamed from: m */
    public final int f27949m;

    /* JADX INFO: renamed from: n */
    public final boolean f27950n;

    /* JADX INFO: renamed from: o */
    public final boolean f27951o;

    /* JADX INFO: renamed from: p */
    public final int f27952p;

    /* JADX INFO: renamed from: q */
    public final Uri f27953q;

    /* JADX INFO: renamed from: r */
    public final Bitmap.CompressFormat f27954r;

    /* JADX INFO: renamed from: s */
    public final int f27955s;

    public BitmapCroppingWorkerTask(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, int i4, int i5, boolean z2, boolean z3, int i6, Uri uri, Bitmap.CompressFormat compressFormat, int i7) {
        this.f27937a = new WeakReference<>(cropImageView);
        this.f27940d = cropImageView.getContext();
        this.f27938b = bitmap;
        this.f27941e = fArr;
        this.f27939c = null;
        this.f27942f = i;
        this.f27945i = z;
        this.f27946j = i2;
        this.f27947k = i3;
        this.f27948l = i4;
        this.f27949m = i5;
        this.f27950n = z2;
        this.f27951o = z3;
        this.f27952p = i6;
        this.f27953q = uri;
        this.f27954r = compressFormat;
        this.f27955s = i7;
        this.f27943g = 0;
        this.f27944h = 0;
    }

    @Override // android.os.AsyncTask
    public a doInBackground(Void[] voidArr) {
        BitmapUtils2.a aVarM12507e;
        try {
            if (isCancelled()) {
                return null;
            }
            Uri uri = this.f27939c;
            if (uri != null) {
                aVarM12507e = BitmapUtils2.m12505c(this.f27940d, uri, this.f27941e, this.f27942f, this.f27943g, this.f27944h, this.f27945i, this.f27946j, this.f27947k, this.f27948l, this.f27949m, this.f27950n, this.f27951o);
            } else {
                Bitmap bitmap = this.f27938b;
                if (bitmap == null) {
                    return new a((Bitmap) null, 1);
                }
                aVarM12507e = BitmapUtils2.m12507e(bitmap, this.f27941e, this.f27942f, this.f27945i, this.f27946j, this.f27947k, this.f27950n, this.f27951o);
            }
            Bitmap bitmapM12523u = BitmapUtils2.m12523u(aVarM12507e.f27977a, this.f27948l, this.f27949m, this.f27952p);
            Uri uri2 = this.f27953q;
            if (uri2 == null) {
                return new a(bitmapM12523u, aVarM12507e.f27978b);
            }
            BitmapUtils2.m12524v(this.f27940d, bitmapM12523u, uri2, this.f27954r, this.f27955s);
            if (bitmapM12523u != null) {
                bitmapM12523u.recycle();
            }
            return new a(this.f27953q, aVarM12507e.f27978b);
        } catch (Exception e) {
            return new a(e, this.f27953q != null);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        Bitmap bitmap;
        CropImageView cropImageView;
        a aVar2 = aVar;
        if (aVar2 != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.f27937a.get()) != null) {
                z = true;
                cropImageView.f29353R = null;
                cropImageView.m12948h();
                CropImageView.InterfaceC6012e interfaceC6012e = cropImageView.f29342G;
                if (interfaceC6012e != null) {
                    Uri uri = aVar2.f27957b;
                    Exception exc = aVar2.f27958c;
                    cropImageView.getCropPoints();
                    cropImageView.getCropRect();
                    cropImageView.getWholeImageRect();
                    cropImageView.getRotatedDegrees();
                    ((CropImageActivity) interfaceC6012e).m12938O(uri, exc, aVar2.f27959d);
                }
            }
            if (z || (bitmap = aVar2.f27956a) == null) {
                return;
            }
            bitmap.recycle();
        }
    }

    /* JADX INFO: renamed from: c.p.a.a.a$a */
    /* JADX INFO: compiled from: BitmapCroppingWorkerTask.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Bitmap f27956a;

        /* JADX INFO: renamed from: b */
        public final Uri f27957b;

        /* JADX INFO: renamed from: c */
        public final Exception f27958c;

        /* JADX INFO: renamed from: d */
        public final int f27959d;

        public a(Bitmap bitmap, int i) {
            this.f27956a = bitmap;
            this.f27957b = null;
            this.f27958c = null;
            this.f27959d = i;
        }

        public a(Uri uri, int i) {
            this.f27956a = null;
            this.f27957b = uri;
            this.f27958c = null;
            this.f27959d = i;
        }

        public a(Exception exc, boolean z) {
            this.f27956a = null;
            this.f27957b = null;
            this.f27958c = exc;
            this.f27959d = 1;
        }
    }

    public BitmapCroppingWorkerTask(CropImageView cropImageView, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, int i8, Uri uri2, Bitmap.CompressFormat compressFormat, int i9) {
        this.f27937a = new WeakReference<>(cropImageView);
        this.f27940d = cropImageView.getContext();
        this.f27939c = uri;
        this.f27941e = fArr;
        this.f27942f = i;
        this.f27945i = z;
        this.f27946j = i4;
        this.f27947k = i5;
        this.f27943g = i2;
        this.f27944h = i3;
        this.f27948l = i6;
        this.f27949m = i7;
        this.f27950n = z2;
        this.f27951o = z3;
        this.f27952p = i8;
        this.f27953q = uri2;
        this.f27954r = compressFormat;
        this.f27955s = i9;
        this.f27938b = null;
    }
}
