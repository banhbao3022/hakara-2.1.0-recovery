package com.theartofdev.edmodo.cropper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;
import mtp.media.karaoke.R;
import p007c.p451o.p452a.C5729a;
import p007c.p466p.p467a.p468a.CropImage3;
import p007c.p466p.p467a.p468a.CropImageOptions;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p644b.p645c.AppCompatActivity;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: loaded from: classes.dex */
public class CropImageActivity extends AppCompatActivity implements CropImageView.InterfaceC6016i, CropImageView.InterfaceC6012e {

    /* JADX INFO: renamed from: u */
    public CropImageView f29332u;

    /* JADX INFO: renamed from: v */
    public Uri f29333v;

    /* JADX INFO: renamed from: w */
    public CropImageOptions f29334w;

    /* JADX INFO: renamed from: O */
    public void m12938O(Uri uri, Exception exc, int i) {
        int i2 = exc == null ? -1 : 204;
        CropImage3 cropImage3 = new CropImage3(this.f29332u.getImageUri(), uri, exc, this.f29332u.getCropPoints(), this.f29332u.getCropRect(), this.f29332u.getRotatedDegrees(), this.f29332u.getWholeImageRect(), i);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", cropImage3);
        setResult(i2, intent);
        finish();
    }

    /* JADX INFO: renamed from: P */
    public void m12939P() {
        setResult(0);
        finish();
    }

    /* JADX INFO: renamed from: Q */
    public final void m12940Q(Menu menu, int i, int i2) {
        Drawable icon;
        MenuItem menuItemFindItem = menu.findItem(i);
        if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            icon.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
            menuItemFindItem.setIcon(icon);
        } catch (Exception e) {
            Log.w("AIC", "Failed to update menu item color", e);
        }
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"NewApi"})
    public void onActivityResult(int i, int i2, Intent intent) {
        String action;
        if (i == 200) {
            if (i2 == 0) {
                m12939P();
            }
            if (i2 == -1) {
                boolean z = true;
                if (intent != null && intent.getData() != null && ((action = intent.getAction()) == null || !action.equals("android.media.action.IMAGE_CAPTURE"))) {
                    z = false;
                }
                Uri uriM12460o = (z || intent.getData() == null) ? C5729a.m12460o(this) : intent.getData();
                this.f29333v = uriM12460o;
                if (C5729a.m12470y(this, uriM12460o)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                } else {
                    this.f29332u.setImageUriAsync(this.f29333v);
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f143l.m133b();
        m12939P();
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        CharSequence charSequence;
        super.onCreate(bundle);
        setContentView(R.layout.crop_image_activity);
        this.f29332u = (CropImageView) findViewById(R.id.cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        this.f29333v = (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
        this.f29334w = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        if (bundle == null) {
            Uri uri = this.f29333v;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                if (C5729a.m12469x(this)) {
                    requestPermissions(new String[]{"android.permission.CAMERA"}, 2011);
                } else {
                    C5729a.m12436I(this);
                }
            } else if (C5729a.m12470y(this, this.f29333v)) {
                requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
            } else {
                this.f29332u.setImageUriAsync(this.f29333v);
            }
        }
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            CropImageOptions cropImageOptions = this.f29334w;
            actionBarM14610I.mo14598r((cropImageOptions == null || (charSequence = cropImageOptions.f28002I) == null || charSequence.length() <= 0) ? getResources().getString(R.string.crop_image_activity_title) : this.f29334w.f28002I);
            actionBarM14610I.mo14593m(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.crop_image_menu, menu);
        CropImageOptions cropImageOptions = this.f29334w;
        if (!cropImageOptions.f28013T) {
            menu.removeItem(R.id.crop_image_menu_rotate_left);
            menu.removeItem(R.id.crop_image_menu_rotate_right);
        } else if (cropImageOptions.f28015V) {
            menu.findItem(R.id.crop_image_menu_rotate_left).setVisible(true);
        }
        if (!this.f29334w.f28014U) {
            menu.removeItem(R.id.crop_image_menu_flip);
        }
        if (this.f29334w.f28019Z != null) {
            menu.findItem(R.id.crop_image_menu_crop).setTitle(this.f29334w.f28019Z);
        }
        Drawable drawableM16141b = null;
        try {
            int i = this.f29334w.f28020a0;
            if (i != 0) {
                Object obj = ContextCompat.f37815a;
                drawableM16141b = ContextCompat.c.m16141b(this, i);
                menu.findItem(R.id.crop_image_menu_crop).setIcon(drawableM16141b);
            }
        } catch (Exception e) {
            Log.w("AIC", "Failed to read menu crop drawable", e);
        }
        int i2 = this.f29334w.f28003J;
        if (i2 != 0) {
            m12940Q(menu, R.id.crop_image_menu_rotate_left, i2);
            m12940Q(menu, R.id.crop_image_menu_rotate_right, this.f29334w.f28003J);
            m12940Q(menu, R.id.crop_image_menu_flip, this.f29334w.f28003J);
            if (drawableM16141b != null) {
                m12940Q(menu, R.id.crop_image_menu_crop, this.f29334w.f28003J);
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (menuItem.getItemId() != R.id.crop_image_menu_crop) {
            if (menuItem.getItemId() == R.id.crop_image_menu_rotate_left) {
                this.f29332u.m12945e(-this.f29334w.f28016W);
                return true;
            }
            if (menuItem.getItemId() == R.id.crop_image_menu_rotate_right) {
                this.f29332u.m12945e(this.f29334w.f28016W);
                return true;
            }
            if (menuItem.getItemId() == R.id.crop_image_menu_flip_horizontally) {
                CropImageView cropImageView = this.f29332u;
                cropImageView.f29365r = !cropImageView.f29365r;
                cropImageView.m12941a(cropImageView.getWidth(), cropImageView.getHeight(), true, false);
                return true;
            }
            if (menuItem.getItemId() == R.id.crop_image_menu_flip_vertically) {
                CropImageView cropImageView2 = this.f29332u;
                cropImageView2.f29366s = !cropImageView2.f29366s;
                cropImageView2.m12941a(cropImageView2.getWidth(), cropImageView2.getHeight(), true, false);
                return true;
            }
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            m12939P();
            return true;
        }
        CropImageOptions cropImageOptions = this.f29334w;
        if (cropImageOptions.f28010Q) {
            m12938O(null, null, 1);
        } else {
            Uri uriFromFile = cropImageOptions.f28004K;
            if (uriFromFile == null || uriFromFile.equals(Uri.EMPTY)) {
                try {
                    Bitmap.CompressFormat compressFormat = this.f29334w.f28005L;
                    if (compressFormat == Bitmap.CompressFormat.JPEG) {
                        str = ".jpg";
                    } else {
                        str = compressFormat == Bitmap.CompressFormat.PNG ? ".png" : ".webp";
                    }
                    uriFromFile = Uri.fromFile(File.createTempFile("cropped", str, getCacheDir()));
                } catch (IOException e) {
                    throw new RuntimeException("Failed to create temp file for output image", e);
                }
            }
            Uri uri = uriFromFile;
            CropImageView cropImageView3 = this.f29332u;
            CropImageOptions cropImageOptions2 = this.f29334w;
            Bitmap.CompressFormat compressFormat2 = cropImageOptions2.f28005L;
            int i = cropImageOptions2.f28006M;
            int i2 = cropImageOptions2.f28007N;
            int i3 = cropImageOptions2.f28008O;
            int i4 = cropImageOptions2.f28009P;
            if (cropImageView3.f29342G == null) {
                throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
            }
            cropImageView3.m12949i(i2, i3, i4, uri, compressFormat2, i);
        }
        return true;
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 201) {
            Uri uri = this.f29333v;
            if (uri == null || iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, R.string.crop_image_activity_no_permissions, 1).show();
                m12939P();
            } else {
                this.f29332u.setImageUriAsync(uri);
            }
        }
        if (i == 2011) {
            C5729a.m12436I(this);
        }
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f29332u.setOnSetImageUriCompleteListener(this);
        this.f29332u.setOnCropImageCompleteListener(this);
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f29332u.setOnSetImageUriCompleteListener(null);
        this.f29332u.setOnCropImageCompleteListener(null);
    }
}
