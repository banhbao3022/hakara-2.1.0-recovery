package p000;

import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p561b.UserAdapter;
import p555j.p556a.p557a.p616i.ItemUserBinding;

/* JADX INFO: renamed from: r */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7396r extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34089g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34090h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34091i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7396r(int i, Object obj, Object obj2) {
        super(0);
        this.f34089g = i;
        this.f34090h = obj;
        this.f34091i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f34089g;
        if (i == 0) {
            User user = ((ItemUserBinding) this.f34090h).f32551y;
            if (user != null) {
                InterfaceC6164l<User, Unit> interfaceC6164l = ((UserAdapter) this.f34091i).f31054f;
                Intrinsics2.m13088d(user, "this");
                interfaceC6164l.mo3b(user);
            }
            return Unit.f29502a;
        }
        if (i == 1) {
            User user2 = ((ItemUserBinding) this.f34090h).f32551y;
            if (user2 != null) {
                InterfaceC6164l<User, Unit> interfaceC6164l2 = ((UserAdapter) this.f34091i).f31054f;
                Intrinsics2.m13088d(user2, "this");
                interfaceC6164l2.mo3b(user2);
            }
            return Unit.f29502a;
        }
        if (i != 2) {
            throw null;
        }
        User user3 = ((ItemUserBinding) this.f34090h).f32551y;
        if (user3 != null) {
            InterfaceC6164l<User, Unit> interfaceC6164l3 = ((UserAdapter) this.f34091i).f31055g;
            Intrinsics2.m13088d(user3, "this");
            interfaceC6164l3.mo3b(user3);
            if (user3.getFollowStatus()) {
                ((ItemUserBinding) this.f34090h).f32546t.setBackgroundResource(R.drawable.bg_button_gray_basic_corners);
                ((ItemUserBinding) this.f34090h).f32546t.setText(R.string.txt_following);
                ((ItemUserBinding) this.f34090h).f32546t.setTextColor(-12303292);
            } else {
                ((ItemUserBinding) this.f34090h).f32546t.setBackgroundResource(R.drawable.bg_button_basic_corners);
                ((ItemUserBinding) this.f34090h).f32546t.setText(R.string.txt_follow);
                ((ItemUserBinding) this.f34090h).f32546t.setTextColor(-1);
            }
        }
        return Unit.f29502a;
    }
}
