package p007c.p466p.p467a.p468a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.theartofdev.edmodo.cropper.CropImageActivity;

/* JADX INFO: renamed from: c.p.a.a.e, reason: use source file name */
/* JADX INFO: compiled from: CropImage.java */
/* JADX INFO: loaded from: classes.dex */
public final class CropImage2 {

    /* JADX INFO: renamed from: a */
    public final Uri f27981a;

    /* JADX INFO: renamed from: b */
    public final CropImageOptions f27982b = new CropImageOptions();

    public CropImage2(Uri uri, CropImage cropImage) {
        this.f27981a = uri;
    }

    /* JADX INFO: renamed from: a */
    public CropImage2 m12525a(int i, int i2) {
        CropImageOptions cropImageOptions = this.f27982b;
        cropImageOptions.f28033r = i;
        cropImageOptions.f28034s = i2;
        cropImageOptions.f28032q = true;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m12526b(Activity activity) {
        this.f27982b.m12527a();
        this.f27982b.m12527a();
        Intent intent = new Intent();
        intent.setClass(activity, CropImageActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", this.f27981a);
        bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", this.f27982b);
        intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle);
        activity.startActivityForResult(intent, 203);
    }
}
