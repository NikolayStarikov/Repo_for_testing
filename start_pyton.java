Process process = new ProcessBuilder()
            .command("pyton", "object_detection_car_model.py")
            .start();

process.waitFor();