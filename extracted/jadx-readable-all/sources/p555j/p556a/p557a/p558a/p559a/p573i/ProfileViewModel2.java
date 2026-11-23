package p555j.p556a.p557a.p558a.p559a.p573i;

import android.content.SharedPreferences;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
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
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.MainCoroutineDispatcher;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p606h.p614e.UserRepository;

/* JADX INFO: renamed from: j.a.a.a.a.i.b0, reason: use source file name */
/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.ProfileViewModel$onRefresh$1", m13069f = "ProfileViewModel.kt", m13070l = {86, 98}, m13071m = "invokeSuspend")
public final class ProfileViewModel2 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31415j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ProfileViewModel6 f31416k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31417l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean f31418m;

    /* JADX INFO: renamed from: j.a.a.a.a.i.b0$a */
    /* JADX INFO: compiled from: ProfileViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.ProfileViewModel$onRefresh$1$1", m13069f = "ProfileViewModel.kt", m13070l = {87}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31419j;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return ProfileViewModel2.this.new a(continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return ProfileViewModel2.this.new a(continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            User userM421d;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31419j;
            if (i == 0) {
                C5729a.m12442O(obj);
                ProfileViewModel2 profileViewModel2 = ProfileViewModel2.this;
                UserRepository userRepository = profileViewModel2.f31416k.f31521s;
                int i2 = profileViewModel2.f31417l;
                this.f31419j = 1;
                obj = userRepository.mo14228f(i2, this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(obj);
            }
            User user = (User) ((GetItemResponse) obj).getResults();
            if (user != null) {
                ProfileViewModel2.this.f31416k.f31515m.mo427j(user);
            }
            ProfileViewModel2.this.f31416k.f31520r.mo427j(Boolean.FALSE);
            ProfileViewModel2 profileViewModel3 = ProfileViewModel2.this;
            if (!profileViewModel3.f31418m && (userM421d = profileViewModel3.f31416k.f31515m.m421d()) != null) {
                Intrinsics2.m13089e("current_user", "key");
                String strM12319f = new GsonBuilder().m12322a().m12319f(userM421d);
                SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                if (sharedPreferences == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                outline.m1564O(sharedPreferences, "current_user", strM12319f);
            }
            return Unit.f29502a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewModel2(ProfileViewModel6 profileViewModel6, int i, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f31416k = profileViewModel6;
        this.f31417l = i;
        this.f31418m = z;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new ProfileViewModel2(this.f31416k, this.f31417l, this.f31418m, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new ProfileViewModel2(this.f31416k, this.f31417l, this.f31418m, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31415j;
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
            CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatchers.f29666b;
            a aVar = new a(null);
            this.f31415j = 1;
            if (C5729a.m12445R(mainCoroutineDispatcher, aVar, this) == intrinsics) {
                return intrinsics;
            }
        } catch (Exception e) {
            Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
            ProfileViewModel6 profileViewModel6 = this.f31416k;
            this.f31415j = 2;
            if (profileViewModel6.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
