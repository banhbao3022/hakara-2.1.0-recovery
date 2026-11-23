package mtp.media.karaoke.p628ui.screen.profile.task;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Task;
import mtp.media.karaoke.data.model.Task3;
import mtp.media.karaoke.data.model.Task4;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.data.remote.response.GetCollectedRewardResponse;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.C2172f;
import p007c.p190n.p194b.p266d.p267a.C2186m;
import p007c.p190n.p194b.p266d.p267a.C2191r;
import p007c.p190n.p194b.p266d.p267a.p276f0.AbstractC2174b;
import p007c.p190n.p194b.p266d.p267a.p276f0.AbstractC2175c;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3254lk;
import p007c.p190n.p194b.p266d.p314j.p315a.C3106hk;
import p007c.p190n.p194b.p266d.p314j.p315a.C3346o1;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj;
import p007c.p190n.p194b.p266d.p314j.p315a.iw2;
import p007c.p190n.p385d.p386j.p389b.C5239a;
import p007c.p190n.p385d.p427v.Firebase;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p483s.Collections2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p559a.p573i.p577f0.TaskActivity2;
import p555j.p556a.p557a.p558a.p559a.p573i.p577f0.TaskActivity3;
import p555j.p556a.p557a.p558a.p559a.p573i.p577f0.TaskActivity4;
import p555j.p556a.p557a.p558a.p559a.p573i.p577f0.TaskAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p597g.p599b.PAlertDialog;
import p555j.p556a.p557a.p606h.p608b.Constants;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.TaskActivityBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.MutableLiveData;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: TaskActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskActivity extends BaseActivity3<TaskActivityBinding, ProfileViewModel6> {

    /* JADX INFO: renamed from: w */
    public static final C7333b f33850w = new C7333b(null);

    /* JADX INFO: renamed from: F */
    public AbstractC2174b f33856F;

    /* JADX INFO: renamed from: G */
    public FirebaseAnalytics f33857G;

    /* JADX INFO: renamed from: H */
    public HashMap f33858H;

    /* JADX INFO: renamed from: x */
    public final int f33859x = R.layout.task_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33860y = LazyJVM.m13020a(Lazy4.NONE, new C7332a(this, null, null));

    /* JADX INFO: renamed from: z */
    public TaskAdapter f33861z = new TaskAdapter(new C7334c());

    /* JADX INFO: renamed from: A */
    public List<Integer> f33851A = Collections2.m13038c(1, 2, 3, 4, 5, 6, 7);

    /* JADX INFO: renamed from: B */
    public List<Integer> f33852B = Collections2.m13038c(8, 9, 10, 11, 12, 13, 14);

    /* JADX INFO: renamed from: C */
    public List<Integer> f33853C = Collections2.m13038c(15, 16, 17, 18, 19, 20, 21);

    /* JADX INFO: renamed from: D */
    public List<Integer> f33854D = Collections2.m13038c(22, 23, 24, 25, 26, 27, 28);

    /* JADX INFO: renamed from: E */
    public final ArrayList<Task3> f33855E = new ArrayList<>();

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.task.TaskActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7332a extends Lambda implements InterfaceC6153a<ProfileViewModel6> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33862g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33863h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33864i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7332a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33862g = viewModelStoreOwner;
            this.f33863h = qualifier;
            this.f33864i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.z] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ProfileViewModel6 mo2c() {
            return SkuDao.a.m14107t(this.f33862g, Reflection.m13097a(ProfileViewModel6.class), this.f33863h, this.f33864i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.task.TaskActivity$b */
    /* JADX INFO: compiled from: TaskActivity.kt */
    public static final class C7333b {
        public C7333b() {
        }

        public C7333b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.task.TaskActivity$c */
    /* JADX INFO: compiled from: TaskActivity.kt */
    public static final class C7334c extends Lambda implements InterfaceC6164l<Task, Unit> {
        public C7334c() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Task task) {
            Task task2 = task;
            Intrinsics2.m13089e(task2, "it");
            TaskActivity taskActivity = TaskActivity.this;
            C7333b c7333b = TaskActivity.f33850w;
            Objects.requireNonNull(taskActivity);
            Task4 log = task2.getLog();
            if (log != null && log.getStatus() == 0) {
                Task4 log2 = task2.getLog();
                if (log2 != null) {
                    log2.setStatus(1);
                }
                taskActivity.mo13969R().m13920o(task2.getId(), taskActivity);
            } else if (task2.getType() == 11 && task2.getFinishedCount() < task2.getGoal()) {
                AbstractC2174b abstractC2174b = taskActivity.f33856F;
                if (abstractC2174b != null) {
                    abstractC2174b.mo4626b(taskActivity, new TaskActivity3(taskActivity));
                    AbstractC2174b abstractC2174b2 = taskActivity.f33856F;
                    if (abstractC2174b2 != null) {
                        abstractC2174b2.mo4625a(new TaskActivity4(taskActivity));
                    }
                } else {
                    Intrinsics2.m13089e("The rewarded ad wasn't ready yet.", "message");
                    SkuDao.a.m14092i0(taskActivity, R.string.msg_reward_video_not_ready, 0, 2);
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.task.TaskActivity$d */
    /* JADX INFO: compiled from: TaskActivity.kt */
    public static final class C7335d extends AbstractC2175c {
        public C7335d() {
        }

        @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2140d
        /* JADX INFO: renamed from: a */
        public void mo2740a(C2186m c2186m) {
            Intrinsics2.m13089e(c2186m, "adError");
            String str = c2186m.f10444b;
            Intrinsics2.m13088d(str, "adError.message");
            Intrinsics2.m13089e(str, "message");
            TaskActivity.this.f33856F = null;
        }

        @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2140d
        /* JADX INFO: renamed from: b */
        public void mo2741b(AbstractC2174b abstractC2174b) {
            AbstractC2174b abstractC2174b2 = abstractC2174b;
            Intrinsics2.m13089e(abstractC2174b2, "rewardedAd");
            Intrinsics2.m13089e("Ad successfully loaded.", "message");
            TaskActivity.this.f33856F = abstractC2174b2;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.task.TaskActivity$e */
    /* JADX INFO: compiled from: TaskActivity.kt */
    public static final class C7336e<T> implements Observer<User> {
        public C7336e() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(User user) {
            TaskActivity taskActivity = TaskActivity.this;
            C7333b c7333b = TaskActivity.f33850w;
            taskActivity.m13968Q().mo398f();
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.task.TaskActivity$f */
    /* JADX INFO: compiled from: TaskActivity.kt */
    public static final class C7337f<T> implements Observer<GetCollectedRewardResponse> {
        public C7337f() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(GetCollectedRewardResponse getCollectedRewardResponse) {
            GetCollectedRewardResponse getCollectedRewardResponse2 = getCollectedRewardResponse;
            if (getCollectedRewardResponse2.getStatus() == 201) {
                TaskActivity.this.mo13969R().m13923r();
                TaskActivity taskActivity = TaskActivity.this;
                String string = taskActivity.getString(R.string.text_great);
                Intrinsics2.m13088d(string, "getString(R.string.text_great)");
                String string2 = TaskActivity.this.getString(R.string.message_collected_reward);
                Intrinsics2.m13088d(string2, "getString(R.string.message_collected_reward)");
                int coins = getCollectedRewardResponse2.getCoins();
                int exps = getCollectedRewardResponse2.getExps();
                int diamonds = getCollectedRewardResponse2.getDiamonds();
                View viewInflate = LayoutInflater.from(taskActivity).inflate(R.layout.layout_popup_diamond_coin_exp, (ViewGroup) null, false);
                Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                TextView textView = (TextView) linearLayout.findViewById(R.id.message);
                Intrinsics2.m13088d(textView, "layout.message");
                textView.setText(string2);
                if (coins > 0) {
                    ImageView imageView = (ImageView) linearLayout.findViewById(R.id.iconCoin);
                    Intrinsics2.m13088d(imageView, "layout.iconCoin");
                    SkuDao.a.m14068T(imageView);
                    TextView textView2 = (TextView) linearLayout.findViewById(R.id.coins);
                    Intrinsics2.m13088d(textView2, "layout.coins");
                    SkuDao.a.m14068T(textView2);
                    TextView textView3 = (TextView) linearLayout.findViewById(R.id.coins);
                    Intrinsics2.m13088d(textView3, "layout.coins");
                    String string3 = taskActivity.getString(R.string.txt_plus_item);
                    Intrinsics2.m13088d(string3, "getString(R.string.txt_plus_item)");
                    outline.m1574Y(new Object[]{String.valueOf(coins)}, 1, string3, "java.lang.String.format(format, *args)", textView3);
                }
                if (exps > 0) {
                    ImageView imageView2 = (ImageView) linearLayout.findViewById(R.id.iconExp);
                    Intrinsics2.m13088d(imageView2, "layout.iconExp");
                    SkuDao.a.m14068T(imageView2);
                    TextView textView4 = (TextView) linearLayout.findViewById(R.id.exp);
                    Intrinsics2.m13088d(textView4, "layout.exp");
                    SkuDao.a.m14068T(textView4);
                    TextView textView5 = (TextView) linearLayout.findViewById(R.id.exp);
                    Intrinsics2.m13088d(textView5, "layout.exp");
                    String string4 = taskActivity.getString(R.string.txt_plus_item);
                    Intrinsics2.m13088d(string4, "getString(R.string.txt_plus_item)");
                    outline.m1574Y(new Object[]{String.valueOf(exps)}, 1, string4, "java.lang.String.format(format, *args)", textView5);
                }
                if (diamonds > 0) {
                    ImageView imageView3 = (ImageView) linearLayout.findViewById(R.id.iconDiamond);
                    Intrinsics2.m13088d(imageView3, "layout.iconDiamond");
                    SkuDao.a.m14068T(imageView3);
                    TextView textView6 = (TextView) linearLayout.findViewById(R.id.diamonds);
                    Intrinsics2.m13088d(textView6, "layout.diamonds");
                    SkuDao.a.m14068T(textView6);
                    TextView textView7 = (TextView) linearLayout.findViewById(R.id.diamonds);
                    Intrinsics2.m13088d(textView7, "layout.diamonds");
                    String string5 = taskActivity.getString(R.string.txt_plus_item);
                    Intrinsics2.m13088d(string5, "getString(R.string.txt_plus_item)");
                    outline.m1574Y(new Object[]{String.valueOf(diamonds)}, 1, string5, "java.lang.String.format(format, *args)", textView7);
                }
                PAlertDialog pAlertDialog = new PAlertDialog(taskActivity, 4);
                pAlertDialog.m14012i(string);
                pAlertDialog.m14010e(pAlertDialog.getContext().getResources().getDrawable(R.drawable.ic_checkin_success, taskActivity.getTheme()));
                pAlertDialog.m14009d(taskActivity.getString(R.string.f33401ok));
                pAlertDialog.m14011f(linearLayout);
                pAlertDialog.m14008c(pAlertDialog.getContext().getResources().getDrawable(R.drawable.bg_button_basic_corners, taskActivity.getTheme()));
                pAlertDialog.show();
                User userM421d = TaskActivity.this.mo13969R().f31515m.m421d();
                if (userM421d != null) {
                    userM421d.setCoins(getCollectedRewardResponse2.getCoins() + userM421d.getCoins());
                    userM421d.setExps(getCollectedRewardResponse2.getExps() + userM421d.getExps());
                    userM421d.setDiamonds(getCollectedRewardResponse2.getDiamonds() + userM421d.getDiamonds());
                    Intrinsics2.m13089e("current_user", "key");
                    String strM12319f = new GsonBuilder().m12322a().m12319f(userM421d);
                    SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                    if (sharedPreferences == null) {
                        Intrinsics2.m13096l("preferences");
                        throw null;
                    }
                    outline.m1564O(sharedPreferences, "current_user", strM12319f);
                    TaskActivity.this.m13968Q().mo398f();
                }
            }
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33859x;
    }

    /* JADX INFO: renamed from: U */
    public View m14427U(int i) {
        if (this.f33858H == null) {
            this.f33858H = new HashMap();
        }
        View view = (View) this.f33858H.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33858H.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: V */
    public final void m14428V() {
        Constants constants = Constants.f32272c;
        List<String> list = Constants.f32271b;
        C2191r.a aVar = new C2191r.a();
        aVar.f10587c.clear();
        if (list != null) {
            aVar.f10587c.addAll(list);
        }
        C2096e.m4587w(aVar.m4633a());
        C3346o1 c3346o1 = new C3346o1(new C2172f.a().f10555a, null);
        C7335d c7335d = new C7335d();
        C2622l.m5379i(this, "Context cannot be null.");
        C2622l.m5379i("ca-app-pub-1954765915398379/1228391388", "AdUnitId cannot be null.");
        C2622l.m5379i(c7335d, "LoadCallback cannot be null.");
        C3106hk c3106hk = new C3106hk(this, "ca-app-pub-1954765915398379/1228391388");
        try {
            InterfaceC3735yj interfaceC3735yj = c3106hk.f14885a;
            if (interfaceC3735yj != null) {
                interfaceC3735yj.mo6902D3(iw2.f15412a.m7314a(c3106hk.f14886b, c3346o1), new BinderC3254lk(c7335d, c3106hk));
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public ProfileViewModel6 mo13969R() {
        return (ProfileViewModel6) this.f33860y.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        RecyclerView recyclerView;
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) m14427U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        m14615N((Toolbar) m14427U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14597q(R.string.txt_task);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14593m(true);
        }
        ActionBar actionBarM14610I3 = m14610I();
        if (actionBarM14610I3 != null) {
            actionBarM14610I3.mo14594n(true);
        }
        this.f33857G = C5239a.m11682a(Firebase.f27225a);
        MutableLiveData<User> mutableLiveData = mo13969R().f31515m;
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        mutableLiveData.mo427j((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class));
        mo13969R().f31515m.mo422e(this, new C7336e());
        mo13969R().f31517o.mo422e(this, new C7337f());
        mo13969R().m13923r();
        RecyclerView recyclerView2 = (RecyclerView) m14427U(R.id.recycler_view);
        Intrinsics2.m13088d(recyclerView2, "recycler_view");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerView3 = (RecyclerView) m14427U(R.id.recycler_view);
        if ((recyclerView3 != null ? recyclerView3.getAdapter() : null) == null && (recyclerView = (RecyclerView) m14427U(R.id.recycler_view)) != null) {
            recyclerView.setAdapter(this.f33861z);
        }
        mo13969R().f31518p.mo422e(this, new TaskActivity2(this));
        m14428V();
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
