package p000;

import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p561b.UserSuggestionAdapter;
import p555j.p556a.p557a.p616i.ItemUserSuggestionBinding;

/* JADX INFO: renamed from: v */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7404v extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34126g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34127h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7404v(int i, Object obj, Object obj2) {
        super(0);
        this.f34126g = i;
        this.f34127h = obj;
        this.f34128i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f34126g;
        if (i == 0) {
            User user = ((ItemUserSuggestionBinding) this.f34127h).f32727v;
            if (user != null) {
                InterfaceC6164l<User, Unit> interfaceC6164l = ((UserSuggestionAdapter) this.f34128i).f31049f;
                Intrinsics2.m13088d(user, "this");
                interfaceC6164l.mo3b(user);
            }
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        User user2 = ((ItemUserSuggestionBinding) this.f34127h).f32727v;
        if (user2 != null) {
            InterfaceC6164l<User, Unit> interfaceC6164l2 = ((UserSuggestionAdapter) this.f34128i).f31050g;
            Intrinsics2.m13088d(user2, "this");
            interfaceC6164l2.mo3b(user2);
            if (user2.getFollowStatus()) {
                ((ItemUserSuggestionBinding) this.f34127h).f32726u.setBackgroundResource(R.drawable.bg_button_gray_basic_corners);
                ((ItemUserSuggestionBinding) this.f34127h).f32726u.setText(R.string.txt_following);
                ((ItemUserSuggestionBinding) this.f34127h).f32726u.setTextColor(-12303292);
            } else {
                ((ItemUserSuggestionBinding) this.f34127h).f32726u.setBackgroundResource(R.drawable.bg_button_basic_corners);
                ((ItemUserSuggestionBinding) this.f34127h).f32726u.setText(R.string.txt_follow);
                ((ItemUserSuggestionBinding) this.f34127h).f32726u.setTextColor(-1);
            }
        }
        return Unit.f29502a;
    }
}
