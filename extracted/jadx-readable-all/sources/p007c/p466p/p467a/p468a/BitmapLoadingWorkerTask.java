package p007c.p466p.p467a.p468a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.theartofdev.edmodo.cropper.CropImageActivity;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import p636z0.p750o.p751a.ExifInterface;

/* JADX INFO: renamed from: c.p.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: BitmapLoadingWorkerTask.java */
/* JADX INFO: loaded from: classes.dex */
public final class BitmapLoadingWorkerTask extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a */
    public final WeakReference<CropImageView> f27960a;

    /* JADX INFO: renamed from: b */
    public final Uri f27961b;

    /* JADX INFO: renamed from: c */
    public final Context f27962c;

    /* JADX INFO: renamed from: d */
    public final int f27963d;

    /* JADX INFO: renamed from: e */
    public final int f27964e;

    public BitmapLoadingWorkerTask(CropImageView cropImageView, Uri uri) {
        this.f27961b = uri;
        this.f27960a = new WeakReference<>(cropImageView);
        this.f27962c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        double d = f > 1.0f ? 1.0f / f : 1.0d;
        this.f27963d = (int) (((double) displayMetrics.widthPixels) * d);
        this.f27964e = (int) (((double) displayMetrics.heightPixels) * d);
    }

    @Override // android.os.AsyncTask
    public a doInBackground(Void[] voidArr) throws Throwable {
        BitmapUtils2.b bVar;
        try {
            ExifInterface exifInterface = null;
            if (isCancelled()) {
                return null;
            }
            BitmapUtils2.a aVarM12511i = BitmapUtils2.m12511i(this.f27962c, this.f27961b, this.f27963d, this.f27964e);
            if (isCancelled()) {
                return null;
            }
            Bitmap bitmap = aVarM12511i.f27977a;
            Context context = this.f27962c;
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(this.f27961b);
                if (inputStreamOpenInputStream != null) {
                    ExifInterface exifInterface2 = new ExifInterface(inputStreamOpenInputStream);
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Exception unused) {
                    }
                    exifInterface = exifInterface2;
                }
            } catch (Exception unused2) {
            }
            int i = 0;
            if (exifInterface != null) {
                ExifInterface.b bVarM16410d = exifInterface.m16410d("Orientation");
                int iM16433f = 1;
                if (bVarM16410d != null) {
                    try {
                        iM16433f = bVarM16410d.m16433f(exifInterface.f38236I);
                    } catch (NumberFormatException unused3) {
                    }
                }
                if (iM16433f == 3) {
                    i = 180;
                } else if (iM16433f == 6) {
                    i = 90;
                } else if (iM16433f == 8) {
                    i = 270;
                }
                bVar = new BitmapUtils2.b(bitmap, i);
            } else {
                bVar = new BitmapUtils2.b(bitmap, 0);
            }
            return new a(this.f27961b, bVar.f27979a, aVarM12511i.f27978b, bVar.f27980b);
        } catch (Exception e) {
            return new a(this.f27961b, e);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        Bitmap bitmap;
        CropImageView cropImageView;
        a aVar2 = aVar;
        if (aVar2 != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = this.f27960a.get()) != null) {
                cropImageView.f29352Q = null;
                cropImageView.m12948h();
                if (aVar2.f27969e == null) {
                    int i = aVar2.f27968d;
                    cropImageView.f29363p = i;
                    cropImageView.m12946f(aVar2.f27966b, 0, aVar2.f27965a, aVar2.f27967c, i);
                }
                CropImageView.InterfaceC6016i interfaceC6016i = cropImageView.f29341F;
                if (interfaceC6016i != null) {
                    Exception exc = aVar2.f27969e;
                    CropImageActivity cropImageActivity = (CropImageActivity) interfaceC6016i;
                    if (exc == null) {
                        Rect rect = cropImageActivity.f29334w.f28011R;
                        if (rect != null) {
                            cropImageActivity.f29332u.setCropRect(rect);
                        }
                        int i2 = cropImageActivity.f29334w.f28012S;
                        if (i2 > -1) {
                            cropImageActivity.f29332u.setRotatedDegrees(i2);
                        }
                    } else {
                        cropImageActivity.m12938O(null, exc, 1);
                    }
                }
                z = true;
            }
            if (z || (bitmap = aVar2.f27966b) == null) {
                return;
            }
            bitmap.recycle();
        }
    }

    /* JADX INFO: renamed from: c.p.a.a.b$a */
    /* JADX INFO: compiled from: BitmapLoadingWorkerTask.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Uri f27965a;

        /* JADX INFO: renamed from: b */
        public final Bitmap f27966b;

        /* JADX INFO: renamed from: c */
        public final int f27967c;

        /* JADX INFO: renamed from: d */
        public final int f27968d;

        /* JADX INFO: renamed from: e */
        public final Exception f27969e;

        public a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.f27965a = uri;
            this.f27966b = bitmap;
            this.f27967c = i;
            this.f27968d = i2;
            this.f27969e = null;
        }

        public a(Uri uri, Exception exc) {
            this.f27965a = uri;
            this.f27966b = null;
            this.f27967c = 0;
            this.f27968d = 0;
            this.f27969e = exc;
        }
    }
}
