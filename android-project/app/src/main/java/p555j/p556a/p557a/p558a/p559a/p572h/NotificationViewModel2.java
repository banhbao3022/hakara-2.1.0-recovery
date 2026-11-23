package p555j.p556a.p557a.p558a.p559a.p572h;

import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.Notification;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;
import p555j.p556a.p557a.p606h.p614e.NotificationRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.h.d, reason: use source file name */
/* JADX INFO: compiled from: NotificationViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NotificationViewModel2 extends BaseLoadMoreRefreshViewModel<Notification> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Boolean> f31367s;

    /* JADX INFO: renamed from: t */
    public final NotificationRepository f31368t;

    /* JADX INFO: renamed from: j.a.a.a.a.h.d$a */
    /* JADX INFO: compiled from: NotificationViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.notification.NotificationViewModel$loadData$1", m13069f = "NotificationViewModel.kt", m13070l = {23, 23, 25}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31369j;

        /* JADX INFO: renamed from: k */
        public int f31370k;

        /* JADX INFO: renamed from: l */
        public int f31371l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31373n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ HashMap f31374o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, HashMap map, Continuation continuation) {
            super(2, continuation);
            this.f31373n = i;
            this.f31374o = map;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return NotificationViewModel2.this.new a(this.f31373n, this.f31374o, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return NotificationViewModel2.this.new a(this.f31373n, this.f31374o, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            int i;
            NotificationViewModel2 notificationViewModel2;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = this.f31371l;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = this.f31370k;
                        notificationViewModel2 = (NotificationViewModel2) this.f31369j;
                        C5729a.m12442O(obj);
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                NotificationViewModel2 notificationViewModel3 = NotificationViewModel2.this;
                i = this.f31373n;
                NotificationRepository notificationRepository = notificationViewModel3.f31368t;
                HashMap<String, String> map = this.f31374o;
                this.f31369j = notificationViewModel3;
                this.f31370k = i;
                this.f31371l = 1;
                Object objMo14185e = notificationRepository.mo14185e(map, this);
                if (objMo14185e == intrinsics) {
                    return intrinsics;
                }
                notificationViewModel2 = notificationViewModel3;
                obj = objMo14185e;
                ArrayList results = ((GetListResponse) obj).getResults();
                this.f31369j = null;
                this.f31371l = 2;
                if (notificationViewModel2.m13986v(i, results, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                NotificationViewModel2 notificationViewModel4 = NotificationViewModel2.this;
                this.f31369j = null;
                this.f31371l = 3;
                if (notificationViewModel4.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public NotificationViewModel2(NotificationRepository notificationRepository) {
        Intrinsics2.m13089e(notificationRepository, "notificationRepository");
        this.f31368t = notificationRepository;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j(Boolean.FALSE);
        this.f31367s = mutableLiveData;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        if (Intrinsics2.m13085a(this.f31367s.m421d(), Boolean.TRUE)) {
            HashMap map = new HashMap();
            map.put("page", String.valueOf(i));
            C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, map, null), 3, null);
        }
    }
}
