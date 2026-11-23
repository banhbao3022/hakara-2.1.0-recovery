package p555j.p556a.p557a.p558a.p592b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import java.util.Objects;
import mtp.media.karaoke.R;
import p000.C7220m;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p645c.AppCompatActivity;
import p636z0.p748n.DataBinderMapper;
import p636z0.p748n.DataBindingUtil;

/* JADX INFO: renamed from: j.a.a.a.b.d, reason: use source file name */
/* JADX INFO: compiled from: BaseActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseActivity3<ViewBinding extends ViewDataBinding, ViewModel extends BaseViewModel> extends AppCompatActivity {

    /* JADX INFO: renamed from: u */
    public ViewBinding f32011u;

    /* JADX INFO: renamed from: v */
    public boolean f32012v = true;

    /* JADX INFO: renamed from: O */
    public static final void m13966O(BaseActivity3 baseActivity3, String str) {
        Objects.requireNonNull(baseActivity3);
        if (str == null || StringsJVM.m12990g(str)) {
            return;
        }
        SkuDao.a.m14099m();
        SkuDao.a.m14069U(baseActivity3, null, str, baseActivity3.getString(R.string.f33401ok), null, null, null, false, false, 249);
    }

    /* JADX INFO: renamed from: P */
    public abstract int mo13967P();

    /* JADX INFO: renamed from: Q */
    public final ViewBinding m13968Q() {
        ViewBinding viewbinding = this.f32011u;
        if (viewbinding != null) {
            return viewbinding;
        }
        Intrinsics2.m13096l("viewBinding");
        throw null;
    }

    /* JADX INFO: renamed from: R */
    public abstract ViewModel mo13969R();

    /* JADX INFO: renamed from: S */
    public void mo13970S(boolean z) {
        if (z) {
            SkuDao.a.m14071W(this, false, false, 3);
        } else {
            SkuDao.a.m14099m();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m13971T(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (this.f32012v) {
            overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
        }
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int iMo13967P = mo13967P();
        DataBinderMapper dataBinderMapper = DataBindingUtil.f38199a;
        setContentView(iMo13967P);
        ViewBinding viewbinding = (ViewBinding) DataBindingUtil.m16403b(null, (ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content), 0, iMo13967P);
        Intrinsics2.m13088d(viewbinding, "DataBindingUtil.setContentView(this, layoutId)");
        this.f32011u = viewbinding;
        viewbinding.mo403q(9, mo13969R());
        ViewBinding viewbinding2 = this.f32011u;
        if (viewbinding2 == null) {
            Intrinsics2.m13096l("viewBinding");
            throw null;
        }
        viewbinding2.m402p(this);
        View view = viewbinding.f726k;
        Intrinsics2.m13088d(view, "root");
        view.setClickable(true);
        viewbinding.m396c();
        BaseViewModel baseViewModelMo13969R = mo13969R();
        baseViewModelMo13969R.f31989c.mo422e(this, new BaseActivity(this));
        baseViewModelMo13969R.m13959h().mo422e(this, new BaseActivity2(this));
        baseViewModelMo13969R.m13961j().mo422e(this, new C7220m(0, this));
        baseViewModelMo13969R.m13958g().mo422e(this, new C7220m(1, this));
        baseViewModelMo13969R.m13960i().mo422e(this, new C7220m(2, this));
        baseViewModelMo13969R.m13962k().mo422e(this, new C7220m(3, this));
        baseViewModelMo13969R.m13963l().mo422e(this, new C7220m(4, this));
    }
}
