package mtp.media.karaoke.p628ui.screen.duet.owner;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p509g1.p510j0.Util9;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p563d.p565e.DuetOwnerActivity2;
import p555j.p556a.p557a.p558a.p559a.p563d.p565e.DuetOwnerAdapter;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel2;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.DuetOwnerActivityBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.MutableLiveData;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: DuetOwnerActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DuetOwnerActivity extends BaseLoadMoreRefreshActivity<DuetOwnerActivityBinding, RecordingViewModel2, Recording> {

    /* JADX INFO: renamed from: y */
    public static final C7256b f33536y = new C7256b(null);

    /* JADX INFO: renamed from: C */
    public Duet f33539C;

    /* JADX INFO: renamed from: D */
    public User f33540D;

    /* JADX INFO: renamed from: E */
    public HashMap f33541E;

    /* JADX INFO: renamed from: z */
    public final int f33542z = R.layout.duet_owner_activity;

    /* JADX INFO: renamed from: A */
    public final Lazy3 f33537A = LazyJVM.m13020a(Lazy4.NONE, new C7255a(this, null, null));

    /* JADX INFO: renamed from: B */
    public final Lazy3 f33538B = LazyJVM.m13021b(new C7257c());

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.duet.owner.DuetOwnerActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7255a extends Lambda implements InterfaceC6153a<RecordingViewModel2> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33543g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33544h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33545i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7255a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33543g = viewModelStoreOwner;
            this.f33544h = qualifier;
            this.f33545i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.e.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public RecordingViewModel2 mo2c() {
            return SkuDao.a.m14107t(this.f33543g, Reflection.m13097a(RecordingViewModel2.class), this.f33544h, this.f33545i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.duet.owner.DuetOwnerActivity$b */
    /* JADX INFO: compiled from: DuetOwnerActivity.kt */
    public static final class C7256b {
        public C7256b() {
        }

        public C7256b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.duet.owner.DuetOwnerActivity$c */
    /* JADX INFO: compiled from: DuetOwnerActivity.kt */
    public static final class C7257c extends Lambda implements InterfaceC6153a<DuetOwnerAdapter> {
        public C7257c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public DuetOwnerAdapter mo2c() {
            return new DuetOwnerAdapter(new DuetOwnerActivity2(this));
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.duet.owner.DuetOwnerActivity$d */
    /* JADX INFO: compiled from: DuetOwnerActivity.kt */
    public static final class C7258d extends Lambda implements InterfaceC6153a<Unit> {
        public C7258d() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            DuetOwnerActivity duetOwnerActivity = DuetOwnerActivity.this;
            Duet duet = duetOwnerActivity.f33539C;
            if (duet != null) {
                DuetOwnerActivity.this.m13971T(SingActivity.f33896w.m14458a(duetOwnerActivity, duet.getSongId(), 2, duet.getRecordingId()));
            }
            return Unit.f29502a;
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33542z;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: U */
    public View mo13978U(int i) {
        if (this.f33541E == null) {
            this.f33541E = new HashMap();
        }
        View view = (View) this.f33541E.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33541E.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: W */
    public BaseListAdapter<Recording, ? extends ViewDataBinding> mo13980W() {
        return (BaseListAdapter) this.f33538B.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: X */
    public void mo13981X() {
        BackgroundMessageView backgroundMessageView = (BackgroundMessageView) mo13978U(R.id.statusView);
        if (backgroundMessageView != null) {
            SkuDao.a.m14068T(backgroundMessageView);
        }
        BackgroundMessageView backgroundMessageView2 = (BackgroundMessageView) mo13978U(R.id.statusView);
        if (backgroundMessageView2 != null) {
            backgroundMessageView2.m14471b(R.drawable.ic_no_song, R.string.message_recording_empty, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public RecordingViewModel2 mo13969R() {
        return (RecordingViewModel2) this.f33537A.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        Intrinsics2.m13088d(intent, "intent");
        Bundle extras = intent.getExtras();
        this.f33539C = extras != null ? (Duet) extras.getParcelable("duet") : null;
        MutableLiveData<Integer> mutableLiveData = mo13969R().f31253t;
        Duet duet = this.f33539C;
        mutableLiveData.mo427j(duet != null ? Integer.valueOf(duet.getId()) : null);
        mo13969R().f31254u.mo427j(5);
        Intent intent2 = getIntent();
        Intrinsics2.m13088d(intent2, "intent");
        Bundle extras2 = intent2.getExtras();
        this.f33540D = extras2 != null ? (User) extras2.getParcelable("user") : null;
        BaseListAdapter<Recording, ? extends ViewDataBinding> baseListAdapterMo13980W = mo13980W();
        Objects.requireNonNull(baseListAdapterMo13980W, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.duet.owner.DuetOwnerAdapter");
        DuetOwnerAdapter duetOwnerAdapter = (DuetOwnerAdapter) baseListAdapterMo13980W;
        User user = this.f33540D;
        duetOwnerAdapter.f31174f = user != null ? user.getAvatar() : null;
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) mo13978U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        m14615N((Toolbar) mo13978U(R.id.toolbar));
        String stringExtra = getIntent().getStringExtra("recording_name");
        String stringExtra2 = getIntent().getStringExtra("message");
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14598r(stringExtra);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14593m(true);
        }
        ActionBar actionBarM14610I3 = m14610I();
        if (actionBarM14610I3 != null) {
            actionBarM14610I3.mo14594n(true);
        }
        TextView textView = (TextView) mo13978U(R.id.txtFullName);
        Intrinsics2.m13088d(textView, "txtFullName");
        User user2 = this.f33540D;
        textView.setText(user2 != null ? user2.getFullName() : null);
        TextView textView2 = (TextView) mo13978U(R.id.txtMessage);
        Intrinsics2.m13088d(textView2, "txtMessage");
        textView2.setText(stringExtra2);
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo13978U(R.id.avatar);
        Intrinsics2.m13088d(appCompatImageView, "avatar");
        User user3 = this.f33540D;
        SkuDao.a.m14054F(appCompatImageView, user3 != null ? user3.getAvatar() : null, null, null, null, null, true, false, true, 0, false, null, null, null, 8030);
        User user4 = this.f33540D;
        int level = user4 != null ? user4.getLevel() : 0;
        TextView textView3 = (TextView) mo13978U(R.id.lblLevel);
        Intrinsics2.m13088d(textView3, "lblLevel");
        textView3.setText(String.valueOf(level));
        TextView textView4 = (TextView) mo13978U(R.id.lblLevel);
        Intrinsics2.m13088d(textView4, "lblLevel");
        SkuDao.a.m14051C(textView4, level);
        TextView textView5 = (TextView) mo13978U(R.id.lblCountDuet);
        Intrinsics2.m13088d(textView5, "lblCountDuet");
        String string = getString(R.string.msg_duet_joined_count);
        Intrinsics2.m13088d(string, "getString(R.string.msg_duet_joined_count)");
        Object[] objArr = new Object[1];
        Duet duet2 = this.f33539C;
        objArr[0] = Integer.valueOf(duet2 != null ? duet2.getJoinCount() : 0);
        textView5.setText(Util9.m13369i(string, objArr));
        TextView textView6 = (TextView) mo13978U(R.id.btnJoin);
        Intrinsics2.m13088d(textView6, "btnJoin");
        SkuDao.a.m14067S(textView6, new C7258d());
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
}
