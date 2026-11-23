package mtp.media.karaoke.p628ui.screen.user;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p483s._Collections;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p561b.UserInviteFragment;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.UserInviteFragmentBinding;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: UserInviteActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UserInviteActivity extends BaseActivity3<UserInviteFragmentBinding, C6799h0> implements UserInviteFragment.d {

    /* JADX INFO: renamed from: w */
    public static final C7379b f34020w = new C7379b(null);

    /* JADX INFO: renamed from: A */
    public int f34021A;

    /* JADX INFO: renamed from: x */
    public final int f34022x = R.layout.user_invite_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f34023y = LazyJVM.m13020a(Lazy4.NONE, new C7378a(this, null, null));

    /* JADX INFO: renamed from: z */
    public UserInviteFragment f34024z;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.user.UserInviteActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7378a extends Lambda implements InterfaceC6153a<C6799h0> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f34025g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f34026h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f34027i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7378a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f34025g = viewModelStoreOwner;
            this.f34026h = qualifier;
            this.f34027i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.r.h0] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public C6799h0 mo2c() {
            return SkuDao.a.m14107t(this.f34025g, Reflection.m13097a(C6799h0.class), this.f34026h, this.f34027i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.user.UserInviteActivity$b */
    /* JADX INFO: compiled from: UserInviteActivity.kt */
    public static final class C7379b {
        public C7379b() {
        }

        public C7379b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f34022x;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: R */
    public BaseViewModel mo13969R() {
        return (C6799h0) this.f34023y.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p561b.UserInviteFragment.d
    /* JADX INFO: renamed from: a */
    public void mo13893a() {
        this.f143l.m133b();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p561b.UserInviteFragment.d
    /* JADX INFO: renamed from: h */
    public void mo13894h(ArrayList<User> arrayList) {
        Intrinsics2.m13089e(arrayList, "users");
        if (this.f34021A <= 0 || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(((User) it.next()).getId()));
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("recording_id", Integer.valueOf(this.f34021A));
        map.put("user_ids", _Collections.m13046k(arrayList2, ",", null, null, 0, null, null, 62));
        ((C6799h0) this.f34023y.getValue()).m13950p(map);
        SkuDao.a.m14092i0(this, R.string.msg_invite_duet_success, 0, 2);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        this.f34021A = getIntent().getIntExtra("recording_id", 0);
        UserInviteFragment userInviteFragment = (UserInviteFragment) m16577C().m16656I("UserInviteFragment_");
        this.f34024z = userInviteFragment;
        if (userInviteFragment == null) {
            Objects.requireNonNull(UserInviteFragment.f31065f0);
            UserInviteFragment userInviteFragment2 = new UserInviteFragment();
            userInviteFragment2.m16540M0(new Bundle());
            this.f34024z = userInviteFragment2;
        }
        BackStackRecord backStackRecord = new BackStackRecord(m16577C());
        Intrinsics2.m13088d(backStackRecord, "supportFragmentManager.beginTransaction()");
        UserInviteFragment userInviteFragment3 = this.f34024z;
        Intrinsics2.m13087c(userInviteFragment3);
        backStackRecord.m16506i(R.id.fragment_container, userInviteFragment3, "UserInviteFragment_");
        backStackRecord.mo16444c();
    }
}
