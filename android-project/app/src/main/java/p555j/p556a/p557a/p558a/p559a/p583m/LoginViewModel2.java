package p555j.p556a.p557a.p558a.p559a.p583m;

import java.util.HashMap;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p614e.UserRepository;

/* JADX INFO: renamed from: j.a.a.a.a.m.d, reason: use source file name */
/* JADX INFO: compiled from: LoginViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.login.LoginViewModel$loginWithGoogle$1", m13069f = "LoginViewModel.kt", m13070l = {32, 32, 34}, m13071m = "invokeSuspend")
public final class LoginViewModel2 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f31666j;

    /* JADX INFO: renamed from: k */
    public int f31667k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ LoginViewModel3 f31668l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ HashMap f31669m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel2(LoginViewModel3 loginViewModel3, HashMap map, Continuation continuation) {
        super(2, continuation);
        this.f31668l = loginViewModel3;
        this.f31669m = map;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new LoginViewModel2(this.f31668l, this.f31669m, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new LoginViewModel2(this.f31668l, this.f31669m, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        LoginViewModel3 loginViewModel3;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31667k;
        try {
            if (i != 0) {
                if (i == 1) {
                    loginViewModel3 = (LoginViewModel3) this.f31666j;
                    C5729a.m12442O(obj);
                } else {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
                return Unit.f29502a;
            }
            C5729a.m12442O(obj);
            loginViewModel3 = this.f31668l;
            UserRepository userRepository = loginViewModel3.f31671m;
            HashMap<String, String> map = this.f31669m;
            this.f31666j = loginViewModel3;
            this.f31667k = 1;
            obj = userRepository.mo14236t(map, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            User user = (User) ((GetItemResponse) obj).getResults();
            this.f31666j = null;
            this.f31667k = 2;
            if (loginViewModel3.m13942o(user, this) == intrinsics) {
                return intrinsics;
            }
        } catch (Exception e) {
            LoginViewModel3 loginViewModel4 = this.f31668l;
            this.f31666j = null;
            this.f31667k = 3;
            if (loginViewModel4.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
