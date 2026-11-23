package mtp.media.karaoke.p628ui.screen.image;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Image;
import p000.C7157k0;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p451o.p452a.C5729a;
import p007c.p466p.p467a.p468a.CropImage2;
import p007c.p466p.p467a.p468a.CropImage3;
import p007c.p466p.p467a.p468a.CropImageOptions;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p530b.p531a.EventBus3;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p582l.ImageActivity2;
import p555j.p556a.p557a.p558a.p559a.p582l.ImageActivity3;
import p555j.p556a.p557a.p558a.p559a.p582l.ImageAdapter;
import p555j.p556a.p557a.p558a.p559a.p582l.ImageViewModel;
import p555j.p556a.p557a.p558a.p559a.p582l.ImageViewModel2;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity;
import p555j.p556a.p557a.p558a.p594d.ImageEvent;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.FragmentLoadmoreRefreshBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p752p.C8310a;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: ImageActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ImageActivity extends BaseLoadMoreRefreshActivity<FragmentLoadmoreRefreshBinding, ImageViewModel2, Image> {

    /* JADX INFO: renamed from: y */
    public static final C7282d f33613y = new C7282d(null);

    /* JADX INFO: renamed from: D */
    public boolean f33617D;

    /* JADX INFO: renamed from: E */
    public boolean f33618E;

    /* JADX INFO: renamed from: F */
    public boolean f33619F;

    /* JADX INFO: renamed from: G */
    public Uri f33620G;

    /* JADX INFO: renamed from: H */
    public HashMap f33621H;

    /* JADX INFO: renamed from: z */
    public final int f33622z = R.layout.image_activity;

    /* JADX INFO: renamed from: A */
    public final Lazy3 f33614A = LazyJVM.m13020a(Lazy4.NONE, new C7281c(this, null, null));

    /* JADX INFO: renamed from: B */
    public final Lazy3 f33615B = LazyJVM.m13021b(new C7283e());

    /* JADX INFO: renamed from: C */
    public int f33616C = 1;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.image.ImageActivity$a */
    /* JADX INFO: compiled from: java-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class C7279a<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f33623a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f33624b;

        public C7279a(int i, Object obj) {
            this.f33623a = i;
            this.f33624b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public final void mo410d(T t) {
            int i = this.f33623a;
            if (i == 0) {
                ((ImageActivity) this.f33624b).mo13969R().m13984q();
                ProgressBar progressBar = (ProgressBar) ((ImageActivity) this.f33624b).mo13978U(R.id.progress_loading);
                Intrinsics2.m13088d(progressBar, "progress_loading");
                SkuDao.a.m14109v(progressBar);
                RecyclerView recyclerView = (RecyclerView) ((ImageActivity) this.f33624b).mo13978U(R.id.recycler_view);
                if (recyclerView != null) {
                    recyclerView.m617m0(0);
                    return;
                }
                return;
            }
            if (i != 1) {
                throw null;
            }
            ((ImageActivity) this.f33624b).mo13969R().m13984q();
            ProgressBar progressBar2 = (ProgressBar) ((ImageActivity) this.f33624b).mo13978U(R.id.progress_loading);
            Intrinsics2.m13088d(progressBar2, "progress_loading");
            SkuDao.a.m14109v(progressBar2);
            BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W = ((ImageActivity) this.f33624b).mo13980W();
            Objects.requireNonNull(baseListAdapterMo13980W, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
            ((ImageAdapter) baseListAdapterMo13980W).f31609h.clear();
            BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W2 = ((ImageActivity) this.f33624b).mo13980W();
            Objects.requireNonNull(baseListAdapterMo13980W2, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
            ((ImageAdapter) baseListAdapterMo13980W2).f31610i = true;
            BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W3 = ((ImageActivity) this.f33624b).mo13980W();
            Objects.requireNonNull(baseListAdapterMo13980W3, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
            ((ImageAdapter) baseListAdapterMo13980W3).f1023a.m673b();
            TextView textView = (TextView) ((ImageActivity) this.f33624b).mo13978U(R.id.toolbarTitle);
            Intrinsics2.m13088d(textView, "toolbarTitle");
            textView.setText(((ImageActivity) this.f33624b).getString(R.string.txt_image));
            TextView textView2 = (TextView) ((ImageActivity) this.f33624b).mo13978U(R.id.btnEdit);
            Intrinsics2.m13088d(textView2, "btnEdit");
            textView2.setText(((ImageActivity) this.f33624b).getString(R.string.txt_edit));
            ((TextView) ((ImageActivity) this.f33624b).mo13978U(R.id.btnEdit)).setTextColor(ContextCompat.m16134b((ImageActivity) this.f33624b, R.color.header_color));
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.image.ImageActivity$b */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class C7280b extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f33625g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f33626h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7280b(int i, Object obj) {
            super(0);
            this.f33625g = i;
            this.f33626h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            int i = this.f33625g;
            if (i == 0) {
                ImageActivity imageActivity = (ImageActivity) this.f33626h;
                C7282d c7282d = ImageActivity.f33613y;
                View viewInflate = imageActivity.getLayoutInflater().inflate(R.layout.bottom_sheet_add_photo, (ViewGroup) null);
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(imageActivity);
                bottomSheetDialog.setContentView(viewInflate);
                bottomSheetDialog.show();
                Intrinsics2.m13088d(viewInflate, "view");
                LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.takePhoneClick);
                Intrinsics2.m13088d(linearLayout, "view.takePhoneClick");
                SkuDao.a.m14067S(linearLayout, new C7157k0(0, imageActivity, bottomSheetDialog));
                LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.chooseLibrary);
                Intrinsics2.m13088d(linearLayout2, "view.chooseLibrary");
                SkuDao.a.m14067S(linearLayout2, new C7157k0(1, imageActivity, bottomSheetDialog));
                return Unit.f29502a;
            }
            if (i != 1) {
                throw null;
            }
            ImageActivity imageActivity2 = (ImageActivity) this.f33626h;
            if (imageActivity2.f33618E) {
                BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W = imageActivity2.mo13980W();
                Objects.requireNonNull(baseListAdapterMo13980W, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
                EventBus3.m13810b().m13815g(new ImageEvent(((ImageAdapter) baseListAdapterMo13980W).f31609h));
                ((ImageActivity) this.f33626h).finish();
            } else {
                if (imageActivity2.f33617D) {
                    BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W2 = imageActivity2.mo13980W();
                    Objects.requireNonNull(baseListAdapterMo13980W2, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
                    ArrayList<Image> arrayList = ((ImageAdapter) baseListAdapterMo13980W2).f31609h;
                    if (arrayList.size() > 0) {
                        ProgressBar progressBar = (ProgressBar) ((ImageActivity) this.f33626h).mo13978U(R.id.progress_loading);
                        Intrinsics2.m13088d(progressBar, "progress_loading");
                        SkuDao.a.m14068T(progressBar);
                        ImageViewModel2 imageViewModel2Mo13969R = ((ImageActivity) this.f33626h).mo13969R();
                        Objects.requireNonNull(imageViewModel2Mo13969R);
                        Intrinsics2.m13089e(arrayList, "selectedImages");
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Integer.valueOf(((Image) it.next()).getId()));
                        }
                        HashMap map = new HashMap();
                        map.put("ids", arrayList2);
                        C5729a.m12428A(C8310a.m16440e(imageViewModel2Mo13969R), null, 0, new ImageViewModel(imageViewModel2Mo13969R, map, null), 3, null);
                    } else {
                        TextView textView = (TextView) ((ImageActivity) this.f33626h).mo13978U(R.id.toolbarTitle);
                        Intrinsics2.m13088d(textView, "toolbarTitle");
                        textView.setText(((ImageActivity) this.f33626h).getString(R.string.txt_image));
                        TextView textView2 = (TextView) ((ImageActivity) this.f33626h).mo13978U(R.id.btnEdit);
                        Intrinsics2.m13088d(textView2, "btnEdit");
                        textView2.setText(((ImageActivity) this.f33626h).getString(R.string.txt_edit));
                        ((TextView) ((ImageActivity) this.f33626h).mo13978U(R.id.btnEdit)).setTextColor(ContextCompat.m16134b((ImageActivity) this.f33626h, R.color.header_color));
                    }
                    ((ImageActivity) this.f33626h).f33617D = false;
                } else {
                    imageActivity2.f33617D = true;
                    TextView textView3 = (TextView) imageActivity2.mo13978U(R.id.toolbarTitle);
                    Intrinsics2.m13088d(textView3, "toolbarTitle");
                    textView3.setText(((ImageActivity) this.f33626h).getString(R.string.txt_request_choose_image));
                    TextView textView4 = (TextView) ((ImageActivity) this.f33626h).mo13978U(R.id.btnEdit);
                    Intrinsics2.m13088d(textView4, "btnEdit");
                    textView4.setText(((ImageActivity) this.f33626h).getString(R.string.text_delete));
                    ((TextView) ((ImageActivity) this.f33626h).mo13978U(R.id.btnEdit)).setTextColor(-65536);
                    BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W3 = ((ImageActivity) this.f33626h).mo13980W();
                    Objects.requireNonNull(baseListAdapterMo13980W3, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
                    ((ImageAdapter) baseListAdapterMo13980W3).f31610i = false;
                }
                BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W4 = ((ImageActivity) this.f33626h).mo13980W();
                Objects.requireNonNull(baseListAdapterMo13980W4, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
                ((ImageAdapter) baseListAdapterMo13980W4).f31608g = ((ImageActivity) this.f33626h).f33617D;
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.image.ImageActivity$c */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7281c extends Lambda implements InterfaceC6153a<ImageViewModel2> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33627g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33628h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33629i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7281c(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33627g = viewModelStoreOwner;
            this.f33628h = qualifier;
            this.f33629i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.l.k] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ImageViewModel2 mo2c() {
            return SkuDao.a.m14107t(this.f33627g, Reflection.m13097a(ImageViewModel2.class), this.f33628h, this.f33629i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.image.ImageActivity$d */
    /* JADX INFO: compiled from: ImageActivity.kt */
    public static final class C7282d {
        public C7282d() {
        }

        /* JADX INFO: renamed from: a */
        public static Intent m14371a(C7282d c7282d, Context context, boolean z, boolean z2, int i) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            Objects.requireNonNull(c7282d);
            Intrinsics2.m13089e(context, "context");
            Intent intent = new Intent(context, (Class<?>) ImageActivity.class);
            intent.putExtra("is_make_video_slide", z);
            intent.putExtra("is_recording_thumbnail", z2);
            return intent;
        }

        public C7282d(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.image.ImageActivity$e */
    /* JADX INFO: compiled from: ImageActivity.kt */
    public static final class C7283e extends Lambda implements InterfaceC6153a<ImageAdapter> {
        public C7283e() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ImageAdapter mo2c() {
            return new ImageAdapter(new ImageActivity2(this), new ImageActivity3(this));
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33622z;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: U */
    public View mo13978U(int i) {
        if (this.f33621H == null) {
            this.f33621H = new HashMap();
        }
        View view = (View) this.f33621H.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33621H.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: V */
    public RecyclerView.AbstractC0160m mo13979V() {
        return new GridLayoutManager(this, 3);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: W */
    public BaseListAdapter<Image, ? extends ViewDataBinding> mo13980W() {
        return (BaseListAdapter) this.f33615B.getValue();
    }

    /* JADX INFO: renamed from: Y */
    public final File m14367Y(Context context) throws IOException {
        char[] cArr = new char[12];
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            cArr[i] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(36));
        }
        File fileCreateTempFile = File.createTempFile("Hakara_" + new String(cArr) + '_', ".jpg", context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
        Intrinsics2.m13088d(fileCreateTempFile, "File.createTempFile(\n   …/* directory */\n        )");
        return fileCreateTempFile;
    }

    /* JADX INFO: renamed from: Z */
    public final void m14368Z() {
        Intrinsics2.m13089e("img 6", "message");
        this.f33616C = 1;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public ImageViewModel2 mo13969R() {
        return (ImageViewModel2) this.f33614A.getValue();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m14370b0() {
        Intrinsics2.m13089e("img 2", "message");
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        int iM15315d = C7804v0.m15315d(this.f33616C);
        if (iM15315d == 1) {
            startActivityForResult(intent, 1);
        } else if (iM15315d == 2) {
            startActivityForResult(intent, 2);
        } else {
            if (iM15315d != 3) {
                return;
            }
            startActivityForResult(intent, 3);
        }
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        super.onActivityResult(i, i2, intent);
        Intrinsics2.m13089e("img 3", "message");
        if (i == 1) {
            if (i2 != -1 || intent == null) {
                m14368Z();
                return;
            }
            CropImage2 cropImage2M12448c = C5729a.m12448c(intent.getData());
            CropImageOptions cropImageOptions = cropImage2M12448c.f27982b;
            cropImageOptions.f28031p = 0.0f;
            cropImageOptions.f28005L = Bitmap.CompressFormat.PNG;
            cropImage2M12448c.m12525a(400, 400);
            cropImage2M12448c.m12526b(this);
            return;
        }
        if (i == 2) {
            if (i2 != -1 || intent == null) {
                m14368Z();
                return;
            }
            CropImage2 cropImage2M12448c2 = C5729a.m12448c(intent.getData());
            CropImageOptions cropImageOptions2 = cropImage2M12448c2.f27982b;
            cropImageOptions2.f28031p = 0.0f;
            cropImageOptions2.f28005L = Bitmap.CompressFormat.PNG;
            cropImage2M12448c2.m12525a(HttpStatus.HTTP_INTERNAL_SERVER_ERROR, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
            cropImage2M12448c2.m12526b(this);
            return;
        }
        if (i == 3) {
            if (i2 != -1 || intent == null) {
                m14368Z();
                return;
            }
            CropImage2 cropImage2M12448c3 = C5729a.m12448c(intent.getData());
            CropImageOptions cropImageOptions3 = cropImage2M12448c3.f27982b;
            cropImageOptions3.f28031p = 0.0f;
            cropImageOptions3.f28005L = Bitmap.CompressFormat.PNG;
            cropImage2M12448c3.m12525a(HttpStatus.HTTP_INTERNAL_SERVER_ERROR, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
            cropImage2M12448c3.m12526b(this);
            return;
        }
        if (i == 4) {
            if (i2 != -1 || (uri = this.f33620G) == null) {
                m14368Z();
                return;
            }
            CropImage2 cropImage2M12448c4 = C5729a.m12448c(uri);
            CropImageOptions cropImageOptions4 = cropImage2M12448c4.f27982b;
            cropImageOptions4.f28031p = 0.0f;
            cropImageOptions4.f28005L = Bitmap.CompressFormat.PNG;
            cropImage2M12448c4.m12525a(HttpStatus.HTTP_INTERNAL_SERVER_ERROR, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
            cropImage2M12448c4.m12526b(this);
            return;
        }
        if (i != 203) {
            return;
        }
        CropImage3 cropImage3 = intent != null ? (CropImage3) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT") : null;
        if (i2 != -1) {
            if (i2 != 204) {
                m14368Z();
                return;
            } else {
                SkuDao.a.m14092i0(this, R.string.error_media_upload_sending, 0, 2);
                m14368Z();
                return;
            }
        }
        Intrinsics2.m13088d(cropImage3, "result");
        Uri uri2 = cropImage3.f29376g;
        Intrinsics2.m13088d(uri2, "result.uri");
        Intrinsics2.m13089e("img 4", "message");
        Intrinsics2.m13089e("img 5", "message");
        C7804v0.m15315d(this.f33616C);
        int iM15315d = C7804v0.m15315d(this.f33616C);
        if (iM15315d != 1 && iM15315d != 2) {
            if (iM15315d != 3) {
                ProgressBar progressBar = (ProgressBar) mo13978U(R.id.progress_loading);
                Intrinsics2.m13088d(progressBar, "progress_loading");
                SkuDao.a.m14068T(progressBar);
                mo13969R().m13935w(this, uri2);
            } else {
                ProgressBar progressBar2 = (ProgressBar) mo13978U(R.id.progress_loading);
                Intrinsics2.m13088d(progressBar2, "progress_loading");
                SkuDao.a.m14068T(progressBar2);
                mo13969R().m13935w(this, uri2);
            }
        }
        this.f33616C = 1;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) mo13978U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        TextView textView = (TextView) mo13978U(R.id.toolbarTitle);
        Intrinsics2.m13088d(textView, "toolbarTitle");
        textView.setText(getString(R.string.txt_image));
        m14615N((Toolbar) mo13978U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14593m(true);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14594n(true);
        }
        BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W = mo13980W();
        Objects.requireNonNull(baseListAdapterMo13980W, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
        ((ImageAdapter) baseListAdapterMo13980W).f31607f = (SkuDao.a.m14104q(this) / 3) - 6;
        this.f33618E = getIntent().getBooleanExtra("is_make_video_slide", false);
        this.f33619F = getIntent().getBooleanExtra("is_recording_thumbnail", false);
        if (this.f33618E) {
            this.f33617D = true;
            TextView textView2 = (TextView) mo13978U(R.id.btnEdit);
            Intrinsics2.m13088d(textView2, "btnEdit");
            textView2.setText(getString(R.string.text_done));
            TextView textView3 = (TextView) mo13978U(R.id.toolbarTitle);
            Intrinsics2.m13088d(textView3, "toolbarTitle");
            textView3.setText(getString(R.string.txt_request_choose_image));
            BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W2 = mo13980W();
            Objects.requireNonNull(baseListAdapterMo13980W2, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
            ((ImageAdapter) baseListAdapterMo13980W2).f31610i = false;
            BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W3 = mo13980W();
            Objects.requireNonNull(baseListAdapterMo13980W3, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
            ((ImageAdapter) baseListAdapterMo13980W3).f31608g = true;
        }
        if (this.f33619F) {
            this.f33617D = false;
            TextView textView4 = (TextView) mo13978U(R.id.btnEdit);
            Intrinsics2.m13088d(textView4, "btnEdit");
            SkuDao.a.m14109v(textView4);
            TextView textView5 = (TextView) mo13978U(R.id.toolbarTitle);
            Intrinsics2.m13088d(textView5, "toolbarTitle");
            textView5.setText(getString(R.string.txt_request_choose_image));
            BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W4 = mo13980W();
            Objects.requireNonNull(baseListAdapterMo13980W4, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
            ((ImageAdapter) baseListAdapterMo13980W4).f31610i = false;
            BaseListAdapter<Image, ? extends ViewDataBinding> baseListAdapterMo13980W5 = mo13980W();
            Objects.requireNonNull(baseListAdapterMo13980W5, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.image.ImageAdapter");
            ((ImageAdapter) baseListAdapterMo13980W5).f31608g = this.f33617D;
        }
        mo13969R().f31633t.mo422e(this, new C7279a(0, this));
        mo13969R().f31634u.mo422e(this, new C7279a(1, this));
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) mo13978U(R.id.btnAddImage);
        Intrinsics2.m13088d(extendedFloatingActionButton, "btnAddImage");
        SkuDao.a.m14067S(extendedFloatingActionButton, new C7280b(0, this));
        TextView textView6 = (TextView) mo13978U(R.id.btnEdit);
        Intrinsics2.m13088d(textView6, "btnEdit");
        SkuDao.a.m14067S(textView6, new C7280b(1, this));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics2.m13089e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f143l.m133b();
        return true;
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics2.m13089e(strArr, "permissions");
        Intrinsics2.m13089e(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            return;
        }
        if ((!(iArr.length == 0)) && iArr[0] == 0) {
            m14370b0();
        } else {
            m14368Z();
            SkuDao.a.m14092i0(this, R.string.crop_image_activity_no_permissions, 0, 2);
        }
    }
}
