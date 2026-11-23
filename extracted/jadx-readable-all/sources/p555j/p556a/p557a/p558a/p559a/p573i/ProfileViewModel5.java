package p555j.p556a.p557a.p558a.p559a.p573i;

import mtp.media.karaoke.data.remote.response.GetAnyResponse;
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

/* JADX INFO: renamed from: j.a.a.a.a.i.y, reason: use source file name */
/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.ProfileViewModel$block$1", m13069f = "ProfileViewModel.kt", m13070l = {166, 168}, m13071m = "invokeSuspend")
public final class ProfileViewModel5 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31510j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ProfileViewModel6 f31511k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31512l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f31513m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewModel5(ProfileViewModel6 profileViewModel6, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f31511k = profileViewModel6;
        this.f31512l = i;
        this.f31513m = i2;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new ProfileViewModel5(this.f31511k, this.f31512l, this.f31513m, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new ProfileViewModel5(this.f31511k, this.f31512l, this.f31513m, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31510j;
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
            UserRepository userRepository = this.f31511k.f31521s;
            int i2 = this.f31512l;
            int i3 = this.f31513m;
            this.f31510j = 1;
            obj = userRepository.mo14233o(i2, i3, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            ((GetAnyResponse) obj).getResults();
        } catch (Exception e) {
            ProfileViewModel6 profileViewModel6 = this.f31511k;
            this.f31510j = 2;
            if (profileViewModel6.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
