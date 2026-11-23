package p555j.p556a.p557a.p558a.p559a.p572h;

import java.util.HashMap;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p614e.NotificationRepository;

/* JADX INFO: renamed from: j.a.a.a.a.h.e, reason: use source file name */
/* JADX INFO: compiled from: NotificationViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.notification.NotificationViewModel$makeAsRead$1", m13069f = "NotificationViewModel.kt", m13070l = {37, 39}, m13071m = "invokeSuspend")
public final class NotificationViewModel3 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31375j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ NotificationViewModel2 f31376k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31377l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f31378m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f31379n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationViewModel3(NotificationViewModel2 notificationViewModel2, int i, int i2, int i3, Continuation continuation) {
        super(2, continuation);
        this.f31376k = notificationViewModel2;
        this.f31377l = i;
        this.f31378m = i2;
        this.f31379n = i3;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new NotificationViewModel3(this.f31376k, this.f31377l, this.f31378m, this.f31379n, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationViewModel3) mo4a(coroutineScope, continuation)).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31375j;
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
            map.put("read_os", String.valueOf(this.f31377l));
            map.put("read_section", String.valueOf(this.f31378m));
            NotificationRepository notificationRepository = this.f31376k.f31368t;
            int i2 = this.f31379n;
            this.f31375j = 1;
            if (notificationRepository.mo14184a(i2, map, this) == intrinsics) {
                return intrinsics;
            }
        } catch (Exception e) {
            NotificationViewModel2 notificationViewModel2 = this.f31376k;
            this.f31375j = 2;
            if (notificationViewModel2.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
