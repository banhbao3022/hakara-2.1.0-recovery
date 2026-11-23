package p555j.p556a.p557a.p558a.p559a.p584n;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.n.d, reason: use source file name */
/* JADX INFO: compiled from: PlayingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlayingActivity4 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlayingActivity f31677f;

    public PlayingActivity4(PlayingActivity playingActivity) {
        this.f31677f = playingActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        ((CardView) this.f31677f.m14383U(R.id.footerLayout)).getWindowVisibleDisplayFrame(rect);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f31677f.m14383U(R.id.container);
        Intrinsics2.m13088d(coordinatorLayout, "container");
        int height = coordinatorLayout.getHeight();
        int i = height - rect.bottom;
        if (i <= ((double) height) * 0.15d) {
            CardView cardView = (CardView) this.f31677f.m14383U(R.id.footerLayout);
            Intrinsics2.m13088d(cardView, "footerLayout");
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (!(layoutParams instanceof ViewGroup.MarginLayoutParams) ? null : layoutParams);
            if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) > 0) {
                CardView cardView2 = (CardView) this.f31677f.m14383U(R.id.footerLayout);
                Intrinsics2.m13088d(cardView2, "footerLayout");
                SkuDao.a.m14065Q(cardView2, 0);
                View viewM14383U = this.f31677f.m14383U(R.id.commentDim);
                Intrinsics2.m13088d(viewM14383U, "commentDim");
                SkuDao.a.m14061M(viewM14383U);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f31677f.m14383U(R.id.actionSocial);
                Intrinsics2.m13088d(constraintLayout, "actionSocial");
                SkuDao.a.m14098l0(constraintLayout, true);
                ImageView imageView = (ImageView) this.f31677f.m14383U(R.id.btnSendComment);
                Intrinsics2.m13088d(imageView, "btnSendComment");
                SkuDao.a.m14061M(imageView);
                ((EditText) this.f31677f.m14383U(R.id.writeComment)).clearFocus();
                return;
            }
            return;
        }
        CardView cardView3 = (CardView) this.f31677f.m14383U(R.id.footerLayout);
        Intrinsics2.m13088d(cardView3, "footerLayout");
        ViewGroup.LayoutParams layoutParams2 = cardView3.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) ? null : layoutParams2);
        if ((marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0) != i) {
            CardView cardView4 = (CardView) this.f31677f.m14383U(R.id.footerLayout);
            Intrinsics2.m13088d(cardView4, "footerLayout");
            SkuDao.a.m14065Q(cardView4, i);
            View viewM14383U2 = this.f31677f.m14383U(R.id.commentDim);
            Intrinsics2.m13088d(viewM14383U2, "commentDim");
            SkuDao.a.m14065Q(viewM14383U2, i);
        }
        View viewM14383U3 = this.f31677f.m14383U(R.id.commentDim);
        Intrinsics2.m13088d(viewM14383U3, "commentDim");
        SkuDao.a.m14098l0(viewM14383U3, true);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f31677f.m14383U(R.id.actionSocial);
        Intrinsics2.m13088d(constraintLayout2, "actionSocial");
        SkuDao.a.m14061M(constraintLayout2);
        ImageView imageView2 = (ImageView) this.f31677f.m14383U(R.id.btnSendComment);
        Intrinsics2.m13088d(imageView2, "btnSendComment");
        SkuDao.a.m14098l0(imageView2, true);
    }
}
