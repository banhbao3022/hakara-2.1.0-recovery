package p555j.p556a.p557a.p558a.p559a.p561b;

import android.widget.TextView;
import java.util.ArrayList;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: j.a.a.a.a.b.e, reason: use source file name */
/* JADX INFO: compiled from: UserInviteFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UserInviteFragment2 extends Lambda implements InterfaceC6164l<ArrayList<User>, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ UserInviteFragment.e f31081g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInviteFragment2(UserInviteFragment.e eVar) {
        super(1);
        this.f31081g = eVar;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(ArrayList<User> arrayList) {
        ArrayList<User> arrayList2 = arrayList;
        Intrinsics2.m13089e(arrayList2, "it");
        UserInviteFragment userInviteFragment = UserInviteFragment.this;
        userInviteFragment.f31071l0 = arrayList2;
        TextView textView = (TextView) userInviteFragment.mo13891c1(R.id.btnInvite);
        Intrinsics2.m13088d(textView, "btnInvite");
        textView.setText(userInviteFragment.m16546Q(R.string.text_invite) + '(' + arrayList2.size() + ')');
        return Unit.f29502a;
    }
}
