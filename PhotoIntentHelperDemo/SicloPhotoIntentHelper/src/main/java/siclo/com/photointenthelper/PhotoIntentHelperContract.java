package siclo.com.photointenthelper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import siclo.com.photointenthelper.models.PhotoIntentException;

/**
 * Created by ericta on 11/13/16.
 */

interface PhotoIntentHelperContract {

    interface View{

        void openGallery();

        void showLoading();

        void finishPickPhotoWithSuccessResult();

        void showPickPhotoFromGalleryError();

        void finishWithNoResult();

        void requestCameraPermission();

        void openCamera(Uri expotedPhotoUri);

        void notifyGalleryDataChanged(Uri exportedPhotoUri);
    }

    interface Presenter{

        void onCreate(Bundle savedInstanceState) throws PhotoIntentException;

        void onPhotoPickedFromGallery(Intent data);

        void onRequestCameraPermissionGranted();

        void onRequestCameraPermissionDenied();

        void onDestroy();

        void onPhotoPickedFromCamera();
    }

}