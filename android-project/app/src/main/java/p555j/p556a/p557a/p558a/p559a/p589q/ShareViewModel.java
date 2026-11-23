package p555j.p556a.p557a.p558a.p559a.p589q;

import java.util.ArrayList;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Ref3;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.MainCoroutineDispatcher;
import p500e1.p501a.p503c2.MainDispatchers;

/* JADX INFO: renamed from: j.a.a.a.a.q.g, reason: use source file name */
/* JADX INFO: compiled from: ShareViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.share.ShareViewModel$loadShares$1", m13069f = "ShareViewModel.kt", m13070l = {32, 36}, m13071m = "invokeSuspend")
public final class ShareViewModel extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31803j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ShareViewModel3 f31804k;

    /* JADX INFO: renamed from: j.a.a.a.a.q.g$a */
    /* JADX INFO: compiled from: ShareViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.share.ShareViewModel$loadShares$1$1", m13069f = "ShareViewModel.kt", m13070l = {}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Ref3 f31806k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref3 ref3, Continuation continuation) {
            super(2, continuation);
            this.f31806k = ref3;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return ShareViewModel.this.new a(this.f31806k, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            ShareViewModel shareViewModel = ShareViewModel.this;
            Ref3 ref3 = this.f31806k;
            shareViewModel.new a(ref3, continuation2);
            Unit unit = Unit.f29502a;
            C5729a.m12442O(unit);
            shareViewModel.f31804k.f31813l.mo427j((ArrayList) ref3.f29604f);
            return unit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            C5729a.m12442O(obj);
            ShareViewModel.this.f31804k.f31813l.mo427j((ArrayList) this.f31806k.f29604f);
            return Unit.f29502a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareViewModel(ShareViewModel3 shareViewModel3, Continuation continuation) {
        super(2, continuation);
        this.f31804k = shareViewModel3;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new ShareViewModel(this.f31804k, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new ShareViewModel(this.f31804k, continuation2).mo6m(Unit.f29502a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.ArrayList] */
    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31803j;
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
            Ref3 ref3 = new Ref3();
            ?? arrayList = new ArrayList();
            ref3.f29604f = arrayList;
            arrayList.add(new Simple(1, null, null, new Integer(R.string.txt_share_facebook), new Integer(R.drawable.ic_share_facebook), 6, null));
            ((ArrayList) ref3.f29604f).add(new Simple(5, null, null, new Integer(R.string.txt_share_copy_link), new Integer(R.drawable.ic_share_copy_link), 6, null));
            ((ArrayList) ref3.f29604f).add(new Simple(2, null, null, new Integer(R.string.txt_share_messenger), new Integer(R.drawable.ic_share_messenger), 6, null));
            ((ArrayList) ref3.f29604f).add(new Simple(6, null, null, new Integer(R.string.txt_share_more), new Integer(R.drawable.ic_share_more), 6, null));
            ((ArrayList) ref3.f29604f).add(new Simple(3, null, null, new Integer(R.string.txt_share_message), new Integer(R.drawable.ic_share_message), 6, null));
            ((ArrayList) ref3.f29604f).add(new Simple(0, "", null, null, null, 28, null));
            ((ArrayList) ref3.f29604f).add(new Simple(4, null, null, new Integer(R.string.txt_share_email), new Integer(R.drawable.ic_share_email), 6, null));
            CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatchers.f29666b;
            a aVar = new a(ref3, null);
            this.f31803j = 1;
            if (C5729a.m12445R(mainCoroutineDispatcher, aVar, this) == intrinsics) {
                return intrinsics;
            }
        } catch (Exception e) {
            ShareViewModel3 shareViewModel3 = this.f31804k;
            this.f31803j = 2;
            if (shareViewModel3.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
