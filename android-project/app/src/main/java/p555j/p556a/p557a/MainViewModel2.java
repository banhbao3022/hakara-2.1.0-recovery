package p555j.p556a.p557a;

import java.util.ArrayList;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple5;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;

/* JADX INFO: renamed from: j.a.a.d, reason: use source file name */
/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.MainViewModel$loadPrivacy$1", m13069f = "MainViewModel.kt", m13070l = {67}, m13071m = "invokeSuspend")
public final class MainViewModel2 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f32085j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ MainViewModel3 f32086k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f32087l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel2(MainViewModel3 mainViewModel3, int i, Continuation continuation) {
        super(2, continuation);
        this.f32086k = mainViewModel3;
        this.f32087l = i;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new MainViewModel2(this.f32086k, this.f32087l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new MainViewModel2(this.f32086k, this.f32087l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f32085j;
        if (i == 0) {
            C5729a.m12442O(obj);
            try {
                ArrayList<Simple5> arrayList = new ArrayList<>();
                arrayList.add(new Simple5(0, new Integer(R.string.text_public), new Integer(R.string.text_public_description), new Integer(R.drawable.ic_public), this.f32087l == 0));
                arrayList.add(new Simple5(1, new Integer(R.string.text_private), new Integer(R.string.text_private_description), new Integer(R.drawable.ic_lock), this.f32087l == 1));
                this.f32086k.f32088l.mo427j(arrayList);
            } catch (Exception e) {
                MainViewModel3 mainViewModel3 = this.f32086k;
                this.f32085j = 1;
                if (mainViewModel3.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
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
