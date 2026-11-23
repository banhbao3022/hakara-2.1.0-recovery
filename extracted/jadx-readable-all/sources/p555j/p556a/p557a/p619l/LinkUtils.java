package p555j.p556a.p557a.p619l;

import android.view.View;
import mtp.media.karaoke.data.model.User;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p593c.LinkListener;

/* JADX INFO: renamed from: j.a.a.l.k, reason: use source file name */
/* JADX INFO: compiled from: LinkUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LinkUtils extends ClickableSpanNoUnderline {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LinkListener f33088f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ User f33089g;

    public LinkUtils(LinkListener linkListener, User user) {
        this.f33088f = linkListener;
        this.f33089g = user;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Intrinsics2.m13089e(view, "widget");
        this.f33088f.mo13912l(this.f33089g.getId());
    }
}
