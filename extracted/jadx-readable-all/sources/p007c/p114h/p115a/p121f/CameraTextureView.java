package p007c.p114h.p115a.p121f;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Objects;
import p007c.p114h.p115a.p117b.CameraPreviewFragment2;
import p007c.p114h.p115a.p119d.CameraPreviewPresenter;
import p007c.p114h.p126d.p129c.p139g.FilterHelper;

/* JADX INFO: renamed from: c.h.a.f.a, reason: use source file name */
/* JADX INFO: compiled from: CameraTextureView.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraTextureView implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CameraTextureView2 f3954f;

    public CameraTextureView(CameraTextureView2 cameraTextureView2) {
        this.f3954f = cameraTextureView2;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Objects.requireNonNull(this.f3954f);
        if (Math.abs(f) > ((double) Math.abs(f2)) * 1.5d) {
            if (f < 0.0f) {
                CameraTextureView2.c cVar = this.f3954f.f3955f;
                if (cVar != null) {
                    CameraPreviewPresenter cameraPreviewPresenter = CameraPreviewFragment2.this.f3876l0;
                    int i = cameraPreviewPresenter.f3891b + 1;
                    cameraPreviewPresenter.f3891b = i;
                    int size = i % FilterHelper.f4194a.size();
                    cameraPreviewPresenter.f3891b = size;
                    cameraPreviewPresenter.m2080d(size);
                }
            } else {
                CameraTextureView2.c cVar2 = this.f3954f.f3955f;
                if (cVar2 != null) {
                    CameraPreviewPresenter cameraPreviewPresenter2 = CameraPreviewFragment2.this.f3876l0;
                    int i2 = cameraPreviewPresenter2.f3891b - 1;
                    cameraPreviewPresenter2.f3891b = i2;
                    if (i2 < 0) {
                        int size2 = FilterHelper.f4194a.size();
                        cameraPreviewPresenter2.f3891b = size2 > 0 ? size2 - 1 : 0;
                    }
                    cameraPreviewPresenter2.m2080d(cameraPreviewPresenter2.f3891b);
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Objects.requireNonNull(this.f3954f);
        if (Math.abs(f) < ((double) Math.abs(f2)) * 1.5d) {
            boolean z = motionEvent.getX() < ((float) (this.f3954f.getWidth() / 2));
            if (f2 > 0.0f) {
                CameraTextureView2.c cVar = this.f3954f.f3955f;
                if (cVar != null) {
                    float fAbs = Math.abs(f2);
                    Objects.requireNonNull((CameraPreviewFragment2.a) cVar);
                    Log.d("CameraPreviewFragment", "swipeUpper, startInLeft ? " + z + ", distance = " + fAbs);
                }
            } else {
                CameraTextureView2.c cVar2 = this.f3954f.f3955f;
                if (cVar2 != null) {
                    float fAbs2 = Math.abs(f2);
                    Objects.requireNonNull((CameraPreviewFragment2.a) cVar2);
                    Log.d("CameraPreviewFragment", "swipeDown, startInLeft ? " + z + ", distance = " + fAbs2);
                }
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        Objects.requireNonNull(this.f3954f);
        return false;
    }
}
