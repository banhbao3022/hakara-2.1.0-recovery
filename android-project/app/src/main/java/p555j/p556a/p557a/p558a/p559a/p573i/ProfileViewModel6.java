package p555j.p556a.p557a.p558a.p559a.p573i;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.Task;
import mtp.media.karaoke.data.model.Task4;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.data.remote.response.GetAnyResponse;
import mtp.media.karaoke.data.remote.response.GetCollectedRewardResponse;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.GsonBuilder;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p606h.p614e.UserRepository;
import p555j.p556a.p557a.p619l.DeviceUtils;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.i.z, reason: use source file name */
/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileViewModel6 extends BaseViewModel {

    /* JADX INFO: renamed from: l */
    public final MutableLiveData<Boolean> f31514l;

    /* JADX INFO: renamed from: m */
    public final MutableLiveData<User> f31515m;

    /* JADX INFO: renamed from: n */
    public final MutableLiveData<User> f31516n;

    /* JADX INFO: renamed from: o */
    public final MutableLiveData<GetCollectedRewardResponse> f31517o;

    /* JADX INFO: renamed from: p */
    public final MutableLiveData<ArrayList<Task>> f31518p;

    /* JADX INFO: renamed from: q */
    public final MutableLiveData<Task4> f31519q;

    /* JADX INFO: renamed from: r */
    public final MutableLiveData<Boolean> f31520r;

    /* JADX INFO: renamed from: s */
    public final UserRepository f31521s;

    /* JADX INFO: renamed from: j.a.a.a.a.i.z$a */
    /* JADX INFO: compiled from: ProfileViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.ProfileViewModel$collectReward$1", m13069f = "ProfileViewModel.kt", m13070l = {154, 158}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31522j;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ int f31524l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ Context f31525m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Context context, Continuation continuation) {
            super(2, continuation);
            this.f31524l = i;
            this.f31525m = context;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return ProfileViewModel6.this.new a(this.f31524l, this.f31525m, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return ProfileViewModel6.this.new a(this.f31524l, this.f31525m, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31522j;
            try {
                if (i != 0) {
                    if (i == 1) {
                        C5729a.m12442O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                HashMap<String, Object> map = new HashMap<>();
                map.put("daily_task_id", new Integer(this.f31524l));
                map.put("unique_id", DeviceUtils.f33080a.m14247a(this.f31525m));
                UserRepository userRepository = ProfileViewModel6.this.f31521s;
                this.f31522j = 1;
                obj = userRepository.mo14231l(map, this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                ProfileViewModel6.this.f31517o.mo427j((GetCollectedRewardResponse) obj);
            } catch (Exception e) {
                ProfileViewModel6 profileViewModel6 = ProfileViewModel6.this;
                this.f31522j = 2;
                if (profileViewModel6.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.i.z$b */
    /* JADX INFO: compiled from: ProfileViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.ProfileViewModel$follow$1", m13069f = "ProfileViewModel.kt", m13070l = {110, 112}, m13071m = "invokeSuspend")
    public static final class b extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31526j;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ int f31528l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f31529m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, Continuation continuation) {
            super(2, continuation);
            this.f31528l = i;
            this.f31529m = i2;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return ProfileViewModel6.this.new b(this.f31528l, this.f31529m, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return ProfileViewModel6.this.new b(this.f31528l, this.f31529m, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31526j;
            try {
                if (i != 0) {
                    if (i == 1) {
                        C5729a.m12442O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                HashMap<String, String> map = new HashMap<>();
                map.put("user_id", String.valueOf(this.f31528l));
                map.put("status", String.valueOf(this.f31529m));
                UserRepository userRepository = ProfileViewModel6.this.f31521s;
                this.f31526j = 1;
                obj = userRepository.mo14235s(map, this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                ((GetAnyResponse) obj).getResults();
            } catch (Exception e) {
                ProfileViewModel6 profileViewModel6 = ProfileViewModel6.this;
                this.f31526j = 2;
                if (profileViewModel6.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.i.z$c */
    /* JADX INFO: compiled from: ProfileViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.ProfileViewModel$getCurrentUser$1$1", m13069f = "ProfileViewModel.kt", m13070l = {45, 50}, m13071m = "invokeSuspend")
    public static final class c extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31530j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ User f31531k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ ProfileViewModel6 f31532l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(User user, Continuation continuation, ProfileViewModel6 profileViewModel6) {
            super(2, continuation);
            this.f31531k = user;
            this.f31532l = profileViewModel6;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return new c(this.f31531k, continuation, this.f31532l);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return new c(this.f31531k, continuation2, this.f31532l).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31530j;
            try {
                if (i != 0) {
                    if (i == 1) {
                        C5729a.m12442O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                UserRepository userRepository = this.f31532l.f31521s;
                int id = this.f31531k.getId();
                this.f31530j = 1;
                obj = userRepository.mo14228f(id, this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                User user = (User) ((GetItemResponse) obj).getResults();
                if (user != null) {
                    this.f31532l.f31515m.mo427j(user);
                    User userM421d = this.f31532l.f31515m.m421d();
                    if (userM421d != null) {
                        Intrinsics2.m13089e("current_user", "key");
                        String strM12319f = new GsonBuilder().m12322a().m12319f(userM421d);
                        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                        if (sharedPreferences == null) {
                            Intrinsics2.m13096l("preferences");
                            throw null;
                        }
                        sharedPreferences.edit().putString("current_user", strM12319f).apply();
                    }
                }
            } catch (Exception e) {
                ProfileViewModel6 profileViewModel6 = this.f31532l;
                this.f31530j = 2;
                if (profileViewModel6.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.i.z$d */
    /* JADX INFO: compiled from: ProfileViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.ProfileViewModel$loadTasks$1", m13069f = "ProfileViewModel.kt", m13070l = {120, 125}, m13071m = "invokeSuspend")
    public static final class d extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31533j;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return ProfileViewModel6.this.new d(continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return ProfileViewModel6.this.new d(continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31533j;
            try {
                if (i != 0) {
                    if (i == 1) {
                        C5729a.m12442O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                UserRepository userRepository = ProfileViewModel6.this.f31521s;
                this.f31533j = 1;
                obj = userRepository.mo14225c(this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                ArrayList<Task> results = ((GetListResponse) obj).getResults();
                if (results != null) {
                    ProfileViewModel6.this.f31518p.mo427j(results);
                }
            } catch (Exception e) {
                ProfileViewModel6 profileViewModel6 = ProfileViewModel6.this;
                this.f31533j = 2;
                if (profileViewModel6.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public ProfileViewModel6(UserRepository userRepository) {
        Intrinsics2.m13089e(userRepository, "userRepository");
        this.f31521s = userRepository;
        this.f31514l = new MutableLiveData<>();
        this.f31515m = new MutableLiveData<>();
        this.f31516n = new MutableLiveData<>();
        this.f31517o = new MutableLiveData<>();
        this.f31518p = new MutableLiveData<>();
        this.f31519q = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j(Boolean.FALSE);
        this.f31520r = mutableLiveData;
    }

    /* JADX INFO: renamed from: o */
    public final void m13920o(int i, Context context) {
        Intrinsics2.m13089e(context, "content");
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, context, null), 3, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m13921p(int i, int i2) {
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new b(i, i2, null), 3, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m13922q() {
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
        if (user != null) {
            C5729a.m12428A(C8310a.m16440e(this), null, 0, new c(user, null, this), 3, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m13923r() {
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new d(null), 3, null);
    }
}
