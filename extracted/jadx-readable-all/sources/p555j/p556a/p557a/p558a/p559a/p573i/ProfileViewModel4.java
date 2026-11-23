package p555j.p556a.p557a.p558a.p559a.p573i;

import java.util.HashMap;
import mtp.media.karaoke.data.model.Task4;
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

/* JADX INFO: renamed from: j.a.a.a.a.i.x, reason: use source file name */
/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.ProfileViewModel$addTaskLog$1", m13069f = "ProfileViewModel.kt", m13070l = {137, 143}, m13071m = "invokeSuspend")
public final class ProfileViewModel4 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31506j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ProfileViewModel6 f31507k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31508l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ String f31509m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewModel4(ProfileViewModel6 profileViewModel6, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.f31507k = profileViewModel6;
        this.f31508l = i;
        this.f31509m = str;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new ProfileViewModel4(this.f31507k, this.f31508l, this.f31509m, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new ProfileViewModel4(this.f31507k, this.f31508l, this.f31509m, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31506j;
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
            map.put("type", new Integer(this.f31508l));
            map.put("unique_id", this.f31509m);
            UserRepository userRepository = this.f31507k.f31521s;
            this.f31506j = 1;
            obj = userRepository.mo14223a(map, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            Task4 task4 = (Task4) ((GetItemResponse) obj).getResults();
            if (task4 != null) {
                this.f31507k.f31519q.mo427j(task4);
            }
        } catch (Exception e) {
            Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
            ProfileViewModel6 profileViewModel6 = this.f31507k;
            this.f31506j = 2;
            if (profileViewModel6.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
