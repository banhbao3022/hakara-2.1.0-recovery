package p555j.p556a.p557a.p558a.p559a.p582l;

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
import p555j.p556a.p557a.p606h.p614e.UserRepository;
import p623k1.Response4;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.l.j, reason: use source file name */
/* JADX INFO: compiled from: ImageViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.image.ImageViewModel$deleteImages$2", m13069f = "ImageViewModel.kt", m13070l = {80, 83}, m13071m = "invokeSuspend")
public final class ImageViewModel extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f31628j;

    /* JADX INFO: renamed from: k */
    public int f31629k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ImageViewModel2 f31630l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ HashMap f31631m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewModel(ImageViewModel2 imageViewModel2, HashMap map, Continuation continuation) {
        super(2, continuation);
        this.f31630l = imageViewModel2;
        this.f31631m = map;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new ImageViewModel(this.f31630l, this.f31631m, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new ImageViewModel(this.f31630l, this.f31631m, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        MutableLiveData<Boolean> mutableLiveData;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31629k;
        try {
            if (i != 0) {
                if (i == 1) {
                    mutableLiveData = (MutableLiveData) this.f31628j;
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
            ImageViewModel2 imageViewModel2 = this.f31630l;
            mutableLiveData = imageViewModel2.f31634u;
            UserRepository userRepository = imageViewModel2.f31635v;
            HashMap<String, Object> map = this.f31631m;
            this.f31628j = mutableLiveData;
            this.f31629k = 1;
            obj = userRepository.mo14239y(map, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            mutableLiveData.mo427j(Boolean.valueOf(((Response4) obj).m14315a()));
        } catch (Exception e) {
            Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
            ImageViewModel2 imageViewModel3 = this.f31630l;
            this.f31628j = null;
            this.f31629k = 2;
            if (imageViewModel3.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
