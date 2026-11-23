package p555j.p556a.p557a.p558a.p559a.p583m;

import android.content.SharedPreferences;
import mtp.media.karaoke.data.model.User;
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
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p606h.p614e.UserRepository;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.m.e, reason: use source file name */
/* JADX INFO: compiled from: LoginViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LoginViewModel3 extends BaseViewModel {

    /* JADX INFO: renamed from: l */
    public final MutableLiveData<User> f31670l;

    /* JADX INFO: renamed from: m */
    public final UserRepository f31671m;

    /* JADX INFO: renamed from: j.a.a.a.a.m.e$a */
    /* JADX INFO: compiled from: LoginViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.login.LoginViewModel$onLoadSuccess$2", m13069f = "LoginViewModel.kt", m13070l = {}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ User f31673k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(User user, Continuation continuation) {
            super(2, continuation);
            this.f31673k = user;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return LoginViewModel3.this.new a(this.f31673k, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return LoginViewModel3.this.new a(this.f31673k, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            C5729a.m12442O(obj);
            User user = this.f31673k;
            if (user != null) {
                Intrinsics2.m13089e("current_user", "key");
                String strM12319f = new GsonBuilder().m12322a().m12319f(user);
                SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                if (sharedPreferences == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                outline.m1564O(sharedPreferences, "current_user", strM12319f);
            }
            User user2 = this.f31673k;
            String accessToken = user2 != null ? user2.getAccessToken() : null;
            if (accessToken != null) {
                Intrinsics2.m13089e("access_token", "key");
                String strM12319f2 = new GsonBuilder().m12322a().m12319f(accessToken);
                SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
                if (sharedPreferences2 == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                outline.m1564O(sharedPreferences2, "access_token", strM12319f2);
            }
            User user3 = this.f31673k;
            if (user3 == null) {
                return null;
            }
            LoginViewModel3.this.f31670l.mo427j(user3);
            return Unit.f29502a;
        }
    }

    public LoginViewModel3(UserRepository userRepository) {
        Intrinsics2.m13089e(userRepository, "userRepository");
        this.f31671m = userRepository;
        MutableLiveData<User> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j(null);
        this.f31670l = mutableLiveData;
    }

    /* JADX INFO: renamed from: o */
    public final Object m13942o(User user, Continuation<? super Unit> continuation) throws Throwable {
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
        Object objM12445R = C5729a.m12445R(MainDispatchers.f29666b, new a(user, null), continuation);
        return objM12445R == Intrinsics.COROUTINE_SUSPENDED ? objM12445R : Unit.f29502a;
    }
}
