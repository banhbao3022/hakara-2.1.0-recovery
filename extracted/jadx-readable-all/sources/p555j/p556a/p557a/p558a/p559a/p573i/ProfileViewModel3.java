package p555j.p556a.p557a.p558a.p559a.p573i;

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

/* JADX INFO: renamed from: j.a.a.a.a.i.c0, reason: use source file name */
/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.ProfileViewModel$updateUser$1", m13069f = "ProfileViewModel.kt", m13070l = {72, 78}, m13071m = "invokeSuspend")
public final class ProfileViewModel3 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31422j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ProfileViewModel6 f31423k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31424l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ HashMap f31425m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewModel3(ProfileViewModel6 profileViewModel6, int i, HashMap map, Continuation continuation) {
        super(2, continuation);
        this.f31423k = profileViewModel6;
        this.f31424l = i;
        this.f31425m = map;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new ProfileViewModel3(this.f31423k, this.f31424l, this.f31425m, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new ProfileViewModel3(this.f31423k, this.f31424l, this.f31425m, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31422j;
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
            UserRepository userRepository = this.f31423k.f31521s;
            int i2 = this.f31424l;
            HashMap<String, String> map = this.f31425m;
            this.f31422j = 1;
            obj = userRepository.mo14232m(i2, map, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            User user = (User) ((GetItemResponse) obj).getResults();
            if (user != null) {
                this.f31423k.f31516n.mo427j(user);
            }
        } catch (Exception e) {
            Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
            ProfileViewModel6 profileViewModel6 = this.f31423k;
            this.f31422j = 2;
            if (profileViewModel6.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
