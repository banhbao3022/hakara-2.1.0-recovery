package p555j.p556a.p557a.p558a.p559a.p572h;

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

/* JADX INFO: renamed from: j.a.a.a.a.h.c, reason: use source file name */
/* JADX INFO: compiled from: NotificationViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.notification.NotificationViewModel$delete$1", m13069f = "NotificationViewModel.kt", m13070l = {46}, m13071m = "invokeSuspend")
public final class NotificationViewModel extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31364j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ NotificationViewModel2 f31365k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31366l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationViewModel(NotificationViewModel2 notificationViewModel2, int i, Continuation continuation) {
        super(2, continuation);
        this.f31365k = notificationViewModel2;
        this.f31366l = i;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new NotificationViewModel(this.f31365k, this.f31366l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new NotificationViewModel(this.f31365k, this.f31366l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31364j;
        if (i == 0) {
            C5729a.m12442O(obj);
            NotificationRepository notificationRepository = this.f31365k.f31368t;
            int i2 = this.f31366l;
            this.f31364j = 1;
            if (notificationRepository.mo14183D(i2, this) == intrinsics) {
                return intrinsics;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5729a.m12442O(obj);
        }
        return Unit.f29502a;
    }
}
