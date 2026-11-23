package mtp.media.karaoke.p628ui.screen.process;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Duet2;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.image.ImageActivity;
import p000.C7219l0;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p190n.p385d.p386j.p389b.C5239a;
import p007c.p190n.p385d.p386j.p389b.C5240b;
import p007c.p190n.p385d.p427v.Firebase;
import p007c.p190n.p430e.GsonBuilder;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p483s._Arrays;
import p477d1.p483s._Collections;
import p477d1.p492w.Utils7;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p477d1.p498z.Random;
import p509g1.RequestBody;
import p526i1.p530b.p531a.EventBus3;
import p526i1.p530b.p531a.Subscribe;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p560a.PostActivity2;
import p555j.p556a.p557a.p558a.p559a.p560a.PostActivity3;
import p555j.p556a.p557a.p558a.p559a.p560a.PostActivity4;
import p555j.p556a.p557a.p558a.p559a.p560a.PrivacySettingFragment;
import p555j.p556a.p557a.p558a.p559a.p561b.UserInviteFragment;
import p555j.p556a.p557a.p558a.p559a.p561b.UserInvitedAdapter;
import p555j.p556a.p557a.p558a.p559a.p590r.C6793e0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6797g0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6801i0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6805k0;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p594d.ImageEvent;
import p555j.p556a.p557a.p558a.p594d.RecordingEvent2;
import p555j.p556a.p557a.p606h.p607a.NowPlayingMetadata;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.PostActivityBinding;
import p555j.p556a.p557a.p619l.DeviceUtils;
import p555j.p556a.p557a.p619l.PathUtils;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.Fragment;
import p636z0.p759s.MutableLiveData;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: PostActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PostActivity extends BaseActivity3<PostActivityBinding, C6799h0> implements PrivacySettingFragment.c, UserInviteFragment.d {

    /* JADX INFO: renamed from: w */
    public static final C7298d f33691w = new C7298d(null);

    /* JADX INFO: renamed from: E */
    public File f33696E;

    /* JADX INFO: renamed from: F */
    public File f33697F;

    /* JADX INFO: renamed from: G */
    public int f33698G;

    /* JADX INFO: renamed from: H */
    public long f33699H;

    /* JADX INFO: renamed from: M */
    public FirebaseAnalytics f33704M;

    /* JADX INFO: renamed from: O */
    public int f33706O;

    /* JADX INFO: renamed from: P */
    public Uri f33707P;

    /* JADX INFO: renamed from: Q */
    public HashMap f33708Q;

    /* JADX INFO: renamed from: x */
    public final int f33709x = R.layout.post_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33710y = LazyJVM.m13020a(Lazy4.NONE, new C7297c(this, null, null));

    /* JADX INFO: renamed from: z */
    public String f33711z = "";

    /* JADX INFO: renamed from: A */
    public String f33692A = "";

    /* JADX INFO: renamed from: B */
    public String f33693B = "";

    /* JADX INFO: renamed from: C */
    public String f33694C = "";

    /* JADX INFO: renamed from: D */
    public String f33695D = "";

    /* JADX INFO: renamed from: I */
    public final UserInvitedAdapter f33700I = new UserInvitedAdapter();

    /* JADX INFO: renamed from: J */
    public final int[] f33701J = {R.string.text_message_solo_1, R.string.text_message_solo_2, R.string.text_message_solo_3};

    /* JADX INFO: renamed from: K */
    public final int[] f33702K = {R.string.text_message_make_duet_1, R.string.text_message_make_duet_2};

    /* JADX INFO: renamed from: L */
    public String f33703L = "";

    /* JADX INFO: renamed from: N */
    public int f33705N = 0;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.PostActivity$a */
    /* JADX INFO: compiled from: java-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class ViewOnClickListenerC7295a implements View.OnClickListener {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f33712f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Object f33713g;

        public ViewOnClickListenerC7295a(int i, Object obj) {
            this.f33712f = i;
            this.f33713g = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.f33712f;
            if (i != 0) {
                if (i != 1) {
                    throw null;
                }
                ((EditText) ((PostActivity) this.f33713g).m14399U(R.id.message)).clearFocus();
                EditText editText = (EditText) ((PostActivity) this.f33713g).m14399U(R.id.message);
                Intrinsics2.m13088d(editText, "message");
                SkuDao.a.m14110w(editText);
                BackStackRecord backStackRecord = new BackStackRecord(((PostActivity) this.f33713g).m16577C());
                backStackRecord.m16507j(R.anim.slide_from_right, R.anim.slide_to_left);
                Objects.requireNonNull(UserInviteFragment.f31065f0);
                UserInviteFragment userInviteFragment = new UserInviteFragment();
                userInviteFragment.m16540M0(new Bundle());
                backStackRecord.m16506i(R.id.fragment, userInviteFragment, "invite_friends");
                backStackRecord.mo16444c();
                return;
            }
            ((EditText) ((PostActivity) this.f33713g).m14399U(R.id.message)).clearFocus();
            EditText editText2 = (EditText) ((PostActivity) this.f33713g).m14399U(R.id.message);
            Intrinsics2.m13088d(editText2, "message");
            SkuDao.a.m14110w(editText2);
            BackStackRecord backStackRecord2 = new BackStackRecord(((PostActivity) this.f33713g).m16577C());
            backStackRecord2.m16507j(R.anim.slide_from_right, R.anim.slide_to_left);
            PrivacySettingFragment.b bVar = PrivacySettingFragment.f31013c0;
            int i2 = ((PostActivity) this.f33713g).f33698G;
            Objects.requireNonNull(bVar);
            PrivacySettingFragment privacySettingFragment = new PrivacySettingFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("privacy_id", i2);
            privacySettingFragment.m16540M0(bundle);
            backStackRecord2.m16506i(R.id.fragment, privacySettingFragment, "privacy_setting");
            backStackRecord2.mo16444c();
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.PostActivity$b */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class C7296b extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f33714g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f33715h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7296b(int i, Object obj) {
            super(0);
            this.f33714g = i;
            this.f33715h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            int i = this.f33714g;
            if (i != 0) {
                if (i != 1) {
                    throw null;
                }
                ((PostActivity) this.f33715h).m13971T(ImageActivity.C7282d.m14371a(ImageActivity.f33613y, (PostActivity) this.f33715h, false, true, 2));
                return Unit.f29502a;
            }
            EditText editText = (EditText) ((PostActivity) this.f33715h).m14399U(R.id.message);
            Intrinsics2.m13088d(editText, "message");
            SkuDao.a.m14110w(editText);
            LinearLayout linearLayout = (LinearLayout) ((PostActivity) this.f33715h).m14399U(R.id.layoutPosting);
            Intrinsics2.m13088d(linearLayout, "layoutPosting");
            SkuDao.a.m14068T(linearLayout);
            StringBuilder sb = new StringBuilder();
            sb.append("recordingFile: ");
            File file = ((PostActivity) this.f33715h).f33696E;
            if (file == null) {
                Intrinsics2.m13096l("recordingFile");
                throw null;
            }
            sb.append(file.getPath());
            Intrinsics2.m13089e(sb.toString(), "message");
            File file2 = ((PostActivity) this.f33715h).f33696E;
            if (file2 == null) {
                Intrinsics2.m13096l("recordingFile");
                throw null;
            }
            if (file2.exists()) {
                RecordingEntity recordingEntityM421d = ((PostActivity) this.f33715h).mo13969R().f31869x.m421d();
                if (recordingEntityM421d != null) {
                    if (recordingEntityM421d.f32338n == 1) {
                        PostActivity postActivity = (PostActivity) this.f33715h;
                        ArrayList<Duet2> arrayListM421d = postActivity.mo13969R().f31860o.m421d();
                        if (arrayListM421d != null) {
                            Intrinsics2.m13089e("postDuet", "message");
                            HashMap map = new HashMap();
                            String strM12319f = new GsonBuilder().m12322a().m12319f(arrayListM421d);
                            Intrinsics2.m13088d(strM12319f, "GsonBuilder().create().toJson(it)");
                            map.put("segments", strM12319f);
                            String string = map.toString();
                            Intrinsics2.m13088d(string, "hashMap.toString()");
                            Intrinsics2.m13089e(string, "message");
                            C6799h0 c6799h0Mo13969R = postActivity.mo13969R();
                            RecordingEntity recordingEntityM421d2 = postActivity.mo13969R().f31869x.m421d();
                            int i2 = recordingEntityM421d2 != null ? recordingEntityM421d2.f32333i : 0;
                            Objects.requireNonNull(c6799h0Mo13969R);
                            Intrinsics2.m13089e(map, "hashMap");
                            C5729a.m12428A(C8310a.m16440e(c6799h0Mo13969R), null, 0, new C6793e0(c6799h0Mo13969R, i2, map, null), 3, null);
                            postActivity.mo13969R().f31866u.mo422e(postActivity, new PostActivity2(postActivity));
                        } else {
                            Intrinsics2.m13089e("postRecording not duet", "message");
                            postActivity.m14401X();
                        }
                    } else {
                        Intrinsics2.m13089e("postRecording not duet 1", "message");
                        ((PostActivity) this.f33715h).m14401X();
                    }
                }
            } else {
                SkuDao.a.m14092i0((PostActivity) this.f33715h, R.string.message_error, 0, 2);
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.PostActivity$c */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7297c extends Lambda implements InterfaceC6153a<C6799h0> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33716g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33717h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33718i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7297c(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33716g = viewModelStoreOwner;
            this.f33717h = qualifier;
            this.f33718i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.r.h0] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public C6799h0 mo2c() {
            return SkuDao.a.m14107t(this.f33716g, Reflection.m13097a(C6799h0.class), this.f33717h, this.f33718i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.PostActivity$d */
    /* JADX INFO: compiled from: PostActivity.kt */
    public static final class C7298d {
        public C7298d() {
        }

        public C7298d(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.PostActivity$e */
    /* JADX INFO: compiled from: PostActivity.kt */
    public static final class C7299e<T> implements Observer<RecordingEntity> {
        public C7299e() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(RecordingEntity recordingEntity) {
            File file;
            RecordingEntity recordingEntity2 = recordingEntity;
            PostActivity postActivity = PostActivity.this;
            postActivity.f33705N = recordingEntity2.f32350z;
            int i = recordingEntity2.f32338n;
            postActivity.f33706O = i;
            if (i == 1) {
                RelativeLayout relativeLayout = (RelativeLayout) postActivity.m14399U(R.id.btnInviteFriendDuet);
                Intrinsics2.m13088d(relativeLayout, "btnInviteFriendDuet");
                SkuDao.a.m14068T(relativeLayout);
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) postActivity.m14399U(R.id.btnInviteFriendDuet);
                Intrinsics2.m13088d(relativeLayout2, "btnInviteFriendDuet");
                SkuDao.a.m14109v(relativeLayout2);
            }
            Intrinsics2.m13089e(recordingEntity2.toString(), "message");
            TextView textView = (TextView) PostActivity.this.m14399U(R.id.txtDuration);
            Intrinsics2.m13088d(textView, "txtDuration");
            NowPlayingMetadata.a aVar = NowPlayingMetadata.f32263a;
            Integer num = recordingEntity2.f32341q;
            textView.setText(aVar.m14034a(num != null ? num.intValue() : 0.0f));
            PostActivity.this.mo13969R().f31858m.mo427j(Integer.valueOf(recordingEntity2.f32338n));
            if (recordingEntity2.f32338n == 1) {
                C6799h0 c6799h0Mo13969R = PostActivity.this.mo13969R();
                String str = recordingEntity2.f32349y;
                Objects.requireNonNull(c6799h0Mo13969R);
                if (str != null) {
                    ArrayList arrayList = (ArrayList) new GsonBuilder().m12322a().m12315b(str, new ArrayList().getClass());
                    ArrayList<Duet2> arrayList2 = new ArrayList<>();
                    if (arrayList != null) {
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object objM12315b = new GsonBuilder().m12322a().m12315b(it.next().toString(), Duet2.class);
                            Intrinsics2.m13088d(objM12315b, "GsonBuilder().create().f… DuetSegment::class.java)");
                            Duet2 duet2 = (Duet2) objM12315b;
                            Intrinsics2.m13089e(duet2.toString(), "message");
                            arrayList2.add(duet2);
                        }
                    }
                    c6799h0Mo13969R.f31860o.mo427j(arrayList2);
                }
            }
            PostActivity postActivity2 = PostActivity.this;
            String string = postActivity2.getString(R.string.text_message_post_placeholder);
            Intrinsics2.m13088d(string, "getString(R.string.text_message_post_placeholder)");
            postActivity2.f33703L = string;
            int i2 = recordingEntity2.f32338n;
            if (i2 == 0) {
                PostActivity postActivity3 = PostActivity.this;
                String string2 = postActivity3.getString(_Arrays.m13033g(postActivity3.f33701J, Random.f29609b));
                Intrinsics2.m13088d(string2, "getString(soloMessages.random())");
                postActivity3.f33703L = string2;
            } else if (i2 == 1) {
                PostActivity postActivity4 = PostActivity.this;
                String string3 = postActivity4.getString(_Arrays.m13033g(postActivity4.f33702K, Random.f29609b));
                Intrinsics2.m13088d(string3, "getString(makeDuetMessages.random())");
                postActivity4.f33703L = string3;
            } else if (i2 == 2) {
                PostActivity postActivity5 = PostActivity.this;
                String string4 = postActivity5.getString(R.string.text_message_duet);
                Intrinsics2.m13088d(string4, "getString(R.string.text_message_duet)");
                postActivity5.f33703L = string4;
            }
            EditText editText = (EditText) PostActivity.this.m14399U(R.id.message);
            Intrinsics2.m13088d(editText, "message");
            editText.setHint(PostActivity.this.f33703L);
            PostActivity.this.f33693B = PathUtils.m14262h(PostActivity.this.getApplicationContext()) + '/' + PostActivity.this.f33692A;
            PostActivity postActivity6 = PostActivity.this;
            String str2 = PathUtils.m14259e(PostActivity.this.getApplicationContext()) + '/' + PostActivity.this.f33692A;
            PathUtils.m14255a(str2);
            postActivity6.f33694C = str2;
            PostActivity postActivity7 = PostActivity.this;
            StringBuilder sb = new StringBuilder();
            sb.append(PostActivity.this.f33694C);
            sb.append('/');
            postActivity7.f33695D = outline.m1551B(sb, PostActivity.this.f33711z, "-resize", 6);
            PostActivity postActivity8 = PostActivity.this;
            if (postActivity8.f33705N == 1) {
                PostActivity postActivity9 = PostActivity.this;
                file = new File(postActivity9.f33694C, Intrinsics2.m13094j(postActivity9.f33711z, C7804v0.m15335x(6)));
            } else {
                PostActivity postActivity10 = PostActivity.this;
                file = new File(postActivity10.f33694C, Intrinsics2.m13094j(postActivity10.f33711z, C7804v0.m15335x(3)));
            }
            postActivity8.f33696E = file;
            PostActivity postActivity11 = PostActivity.this;
            if (postActivity11.f33705N == 1 && postActivity11.f33706O == 1) {
                postActivity11.f33697F = new File(PostActivity.this.f33695D);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(PostActivity.this.f33693B);
            sb2.append("/thumbnail_");
            String strM1550A = outline.m1550A(sb2, PostActivity.this.f33711z, ".png");
            if (PostActivity.this.f33705N == 1 && new File(strM1550A).exists()) {
                PostActivity.this.f33707P = Uri.parse(strM1550A);
            }
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.process.PostActivity$f */
    /* JADX INFO: compiled from: PostActivity.kt */
    public static final class C7300f<T> implements Observer<Recording> {
        public C7300f() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Recording recording) {
            ArrayList<User> arrayListM421d;
            Recording recording2 = recording;
            RecordingEntity recordingEntityM421d = PostActivity.this.mo13969R().f31869x.m421d();
            if (recordingEntityM421d != null && recordingEntityM421d.f32338n == 1) {
                PostActivity postActivity = PostActivity.this;
                if (postActivity.f33698G == 0 && (arrayListM421d = postActivity.mo13969R().f31868w.m421d()) != null) {
                    Intrinsics2.m13089e("send invite user", "message");
                    ArrayList arrayList = new ArrayList();
                    Intrinsics2.m13088d(arrayListM421d, "users");
                    Iterator<T> it = arrayListM421d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((User) it.next()).getId()));
                    }
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("recording_id", Integer.valueOf(recording2.getId()));
                    map.put("user_ids", _Collections.m13046k(arrayList, ",", null, null, 0, null, null, 62));
                    PostActivity.this.mo13969R().m13950p(map);
                }
            }
            PostActivity.m14398V(PostActivity.this);
            EventBus3.m13810b().m13815g(new RecordingEvent2(true));
            SkuDao.a.m14092i0(PostActivity.this, R.string.message_recording_upload_success, 0, 2);
            PostActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: V */
    public static final void m14398V(PostActivity postActivity) {
        Objects.requireNonNull(postActivity);
        File file = new File(String.valueOf(postActivity.f33694C));
        if (file.exists()) {
            Utils7.m13078a(file);
        }
        File file2 = new File(PathUtils.m14263i(postActivity.getApplicationContext()) + '/' + postActivity.f33692A);
        if (file2.exists()) {
            Utils7.m13078a(file2);
        }
        File file3 = new File(postActivity.f33693B);
        if (file3.exists()) {
            Utils7.m13078a(file3);
        }
        C6799h0 c6799h0Mo13969R = postActivity.mo13969R();
        long j2 = postActivity.f33699H;
        Objects.requireNonNull(c6799h0Mo13969R);
        C5729a.m12428A(C8310a.m16440e(c6799h0Mo13969R), null, 0, new C6801i0(c6799h0Mo13969R, j2, null), 3, null);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33709x;
    }

    /* JADX INFO: renamed from: U */
    public View m14399U(int i) {
        if (this.f33708Q == null) {
            this.f33708Q = new HashMap();
        }
        View view = (View) this.f33708Q.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33708Q.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public C6799h0 mo13969R() {
        return (C6799h0) this.f33710y.getValue();
    }

    /* JADX INFO: renamed from: X */
    public final void m14401X() {
        String str;
        HashMap map = new HashMap();
        EditText editText = (EditText) m14399U(R.id.message);
        Intrinsics2.m13088d(editText, "message");
        if (!Intrinsics2.m13085a(editText.getText().toString(), "")) {
            RequestBody.a aVar = RequestBody.f29980a;
            EditText editText2 = (EditText) m14399U(R.id.message);
            Intrinsics2.m13088d(editText2, "message");
            map.put("message", RequestBody.a.m13329c(aVar, editText2.getText().toString(), null, 1));
        } else {
            map.put("message", RequestBody.a.m13329c(RequestBody.f29980a, this.f33703L, null, 1));
        }
        RequestBody.a aVar2 = RequestBody.f29980a;
        map.put("unique_id", RequestBody.a.m13329c(aVar2, DeviceUtils.f33080a.m14247a(this), null, 1));
        map.put("privacy", RequestBody.a.m13329c(aVar2, String.valueOf(this.f33698G), null, 1));
        RecordingEntity recordingEntityM421d = mo13969R().f31869x.m421d();
        map.put("song_id", RequestBody.a.m13329c(aVar2, String.valueOf(recordingEntityM421d != null ? Integer.valueOf(recordingEntityM421d.f32333i) : null), null, 1));
        RecordingEntity recordingEntityM421d2 = mo13969R().f31869x.m421d();
        map.put("name", RequestBody.a.m13329c(aVar2, String.valueOf(recordingEntityM421d2 != null ? recordingEntityM421d2.f32331g : null), null, 1));
        RecordingEntity recordingEntityM421d3 = mo13969R().f31869x.m421d();
        map.put("effect", RequestBody.a.m13329c(aVar2, String.valueOf(recordingEntityM421d3 != null ? recordingEntityM421d3.f32342r : null), null, 1));
        RecordingEntity recordingEntityM421d4 = mo13969R().f31869x.m421d();
        map.put("use_headphone", RequestBody.a.m13329c(aVar2, String.valueOf(recordingEntityM421d4 != null ? recordingEntityM421d4.f32346v : null), null, 1));
        RecordingEntity recordingEntityM421d5 = mo13969R().f31869x.m421d();
        map.put("type", RequestBody.a.m13329c(aVar2, String.valueOf(recordingEntityM421d5 != null ? Integer.valueOf(recordingEntityM421d5.f32338n) : null), null, 1));
        RecordingEntity recordingEntityM421d6 = mo13969R().f31869x.m421d();
        map.put("duet_id", RequestBody.a.m13329c(aVar2, String.valueOf(recordingEntityM421d6 != null ? Integer.valueOf(recordingEntityM421d6.f32334j) : null), null, 1));
        RecordingEntity recordingEntityM421d7 = mo13969R().f31869x.m421d();
        map.put("format", RequestBody.a.m13329c(aVar2, String.valueOf(recordingEntityM421d7 != null ? Integer.valueOf(recordingEntityM421d7.f32350z) : null), null, 1));
        RecordingEntity recordingEntityM421d8 = mo13969R().f31869x.m421d();
        map.put("video_ratio", RequestBody.a.m13329c(aVar2, String.valueOf(recordingEntityM421d8 != null ? Integer.valueOf(recordingEntityM421d8.f32327A) : null), null, 1));
        RecordingEntity recordingEntityM421d9 = mo13969R().f31869x.m421d();
        if (recordingEntityM421d9 != null && (str = recordingEntityM421d9.f32339o) != null) {
            map.put("image_ids", RequestBody.a.m13329c(aVar2, str, null, 1));
        }
        RecordingEntity recordingEntityM421d10 = mo13969R().f31869x.m421d();
        map.put("thumbnail_url", RequestBody.a.m13329c(aVar2, String.valueOf(recordingEntityM421d10 != null ? recordingEntityM421d10.f32336l : null), null, 1));
        RecordingEntity recordingEntityM421d11 = mo13969R().f31869x.m421d();
        map.put(CainMediaMetadataRetriever.METADATA_KEY_DURATION, RequestBody.a.m13329c(aVar2, String.valueOf(recordingEntityM421d11 != null ? recordingEntityM421d11.f32341q : null), null, 1));
        C6799h0 c6799h0Mo13969R = mo13969R();
        File file = this.f33696E;
        if (file == null) {
            Intrinsics2.m13096l("recordingFile");
            throw null;
        }
        int i = this.f33705N;
        File file2 = this.f33697F;
        Uri uri = this.f33707P;
        Objects.requireNonNull(c6799h0Mo13969R);
        Intrinsics2.m13089e(this, "content");
        Intrinsics2.m13089e(file, "file");
        Intrinsics2.m13089e(map, "hashMap");
        C5729a.m12428A(C8310a.m16440e(c6799h0Mo13969R), null, 0, new C6797g0(c6799h0Mo13969R, file, i, file2, uri, this, map, null), 3, null);
        FirebaseAnalytics firebaseAnalytics = this.f33704M;
        if (firebaseAnalytics == null) {
            Intrinsics2.m13096l("firebaseAnalytics");
            throw null;
        }
        C5240b c5240b = new C5240b();
        Song songM421d = mo13969R().f31857l.m421d();
        c5240b.m11683a("song_name", String.valueOf(songM421d != null ? songM421d.getName() : null));
        firebaseAnalytics.m12913a("posted_audio", c5240b.f26349a);
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p561b.UserInviteFragment.d
    /* JADX INFO: renamed from: a */
    public void mo13893a() {
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p561b.UserInviteFragment.d
    /* JADX INFO: renamed from: h */
    public void mo13894h(ArrayList<User> arrayList) {
        Intrinsics2.m13089e(arrayList, "users");
        mo13969R().f31868w.mo427j(arrayList);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentM16656I = m16577C().m16656I("privacy_setting");
        if (fragmentM16656I != null) {
            BackStackRecord backStackRecord = new BackStackRecord(m16577C());
            backStackRecord.m16507j(R.anim.slide_from_left, R.anim.slide_to_right);
            backStackRecord.mo16449h(fragmentM16656I);
            backStackRecord.mo16444c();
            return;
        }
        Fragment fragmentM16656I2 = m16577C().m16656I("invite_friends");
        if (fragmentM16656I2 != null) {
            BackStackRecord backStackRecord2 = new BackStackRecord(m16577C());
            backStackRecord2.m16507j(R.anim.slide_from_left, R.anim.slide_to_right);
            backStackRecord2.mo16449h(fragmentM16656I2);
            backStackRecord2.mo16444c();
            return;
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.bottom_sheet_audio_cancel, (ViewGroup) null);
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(viewInflate);
        bottomSheetDialog.show();
        Intrinsics2.m13088d(viewInflate, "view");
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.optionDraft);
        Intrinsics2.m13088d(linearLayout, "view.optionDraft");
        SkuDao.a.m14067S(linearLayout, new C7219l0(0, this, bottomSheetDialog));
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.optionDelete);
        Intrinsics2.m13088d(linearLayout2, "view.optionDelete");
        SkuDao.a.m14067S(linearLayout2, new C7219l0(1, this, bottomSheetDialog));
        TextView textView = (TextView) viewInflate.findViewById(R.id.continueEditing);
        Intrinsics2.m13088d(textView, "view.continueEditing");
        textView.setText(getString(R.string.text_continue_post));
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.optionContinue);
        Intrinsics2.m13088d(linearLayout3, "view.optionContinue");
        SkuDao.a.m14067S(linearLayout3, new PostActivity4(bottomSheetDialog));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        RecyclerView recyclerView;
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        Toolbar toolbar = (Toolbar) m14399U(R.id.toolbar);
        Intrinsics2.m13088d(toolbar, "toolbar");
        SkuDao.a.m14066R(toolbar, SkuDao.a.m14105r(this));
        m14615N((Toolbar) m14399U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14593m(true);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14594n(true);
        }
        this.f33704M = C5239a.m11682a(Firebase.f27225a);
        Intent intent = getIntent();
        Intrinsics2.m13088d(intent, "intent");
        Bundle extras = intent.getExtras();
        this.f33711z = extras != null ? extras.getString("file_name") : null;
        Intent intent2 = getIntent();
        Intrinsics2.m13088d(intent2, "intent");
        Bundle extras2 = intent2.getExtras();
        this.f33692A = extras2 != null ? extras2.getString("folder_name") : null;
        Intent intent3 = getIntent();
        Intrinsics2.m13088d(intent3, "intent");
        Bundle extras3 = intent3.getExtras();
        if (extras3 != null) {
            extras3.getInt(CainMediaMetadataRetriever.METADATA_KEY_DURATION);
        }
        Intent intent4 = getIntent();
        Intrinsics2.m13088d(intent4, "intent");
        Bundle extras4 = intent4.getExtras();
        this.f33699H = extras4 != null ? extras4.getLong("recording_entity_id") : 0L;
        C6799h0 c6799h0Mo13969R = mo13969R();
        long j2 = this.f33699H;
        Objects.requireNonNull(c6799h0Mo13969R);
        C5729a.m12428A(C8310a.m16440e(c6799h0Mo13969R), null, 0, new C6805k0(c6799h0Mo13969R, j2, null), 3, null);
        mo13969R().f31869x.mo422e(this, new C7299e());
        MutableLiveData<User> mutableLiveData = mo13969R().f31862q;
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        mutableLiveData.mo427j((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class));
        this.f32012v = false;
        mo13969R().f31861p.mo422e(this, new C7300f());
        TextView textView = (TextView) m14399U(R.id.btnPost);
        Intrinsics2.m13088d(textView, "btnPost");
        SkuDao.a.m14067S(textView, new C7296b(0, this));
        ((LinearLayout) m14399U(R.id.btnPrivacy)).setOnClickListener(new ViewOnClickListenerC7295a(0, this));
        ((RelativeLayout) m14399U(R.id.btnInviteFriendDuet)).setOnClickListener(new ViewOnClickListenerC7295a(1, this));
        AppCompatImageView appCompatImageView = (AppCompatImageView) m14399U(R.id.thumbnail);
        Intrinsics2.m13088d(appCompatImageView, "thumbnail");
        SkuDao.a.m14067S(appCompatImageView, new C7296b(1, this));
        EditText editText = (EditText) m14399U(R.id.message);
        Intrinsics2.m13088d(editText, "message");
        Intrinsics2.m13089e(editText, "$this$showKeyboard");
        Object systemService = editText.getContext().getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        editText.requestFocus();
        ((InputMethodManager) systemService).showSoftInput(editText, 0);
        RecyclerView recyclerView2 = (RecyclerView) m14399U(R.id.recyclerUsers);
        if ((recyclerView2 != null ? recyclerView2.getAdapter() : null) == null && (recyclerView = (RecyclerView) m14399U(R.id.recyclerUsers)) != null) {
            recyclerView.setAdapter(this.f33700I);
        }
        RecyclerView recyclerView3 = (RecyclerView) m14399U(R.id.recyclerUsers);
        Intrinsics2.m13088d(recyclerView3, "recyclerUsers");
        recyclerView3.setLayoutManager(new LinearLayoutManager(this, 0, false));
        mo13969R().f31868w.mo422e(this, new PostActivity3(this));
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onDestroy() {
        EventBus3.m13810b().m13821m(this);
        super.onDestroy();
    }

    @Subscribe
    public final void onImageEvent(ImageEvent imageEvent) {
        Intrinsics2.m13089e(imageEvent, "event");
        if (imageEvent.f32051a.size() > 0) {
            RecordingEntity recordingEntityM421d = mo13969R().f31869x.m421d();
            if (recordingEntityM421d != null) {
                recordingEntityM421d.m14116a(imageEvent.f32051a.get(0).getImage());
            }
            m13968Q().mo398f();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics2.m13089e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // p636z0.p644b.p645c.AppCompatActivity, p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (EventBus3.m13810b().m13814f(this)) {
            return;
        }
        EventBus3.m13810b().m13819k(this);
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p560a.PrivacySettingFragment.c
    /* JADX INFO: renamed from: t */
    public void mo13889t(int i) {
        this.f33698G = i;
        if (i == 0) {
            ((ImageView) m14399U(R.id.iconPrivacy)).setImageResource(R.drawable.ic_public);
            TextView textView = (TextView) m14399U(R.id.txtPrivacy);
            Intrinsics2.m13088d(textView, "txtPrivacy");
            textView.setText(getString(R.string.text_public));
            return;
        }
        if (i != 1) {
            return;
        }
        ((ImageView) m14399U(R.id.iconPrivacy)).setImageResource(R.drawable.ic_lock);
        TextView textView2 = (TextView) m14399U(R.id.txtPrivacy);
        Intrinsics2.m13088d(textView2, "txtPrivacy");
        textView2.setText(getString(R.string.text_private));
    }
}
